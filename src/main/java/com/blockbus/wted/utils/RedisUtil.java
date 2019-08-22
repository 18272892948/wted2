package com.blockbus.wted.utils;


import com.blockbus.wted.common.constant.CommonConstant;
import com.blockbus.wted.common.constant.RedisConstant;
import com.blockbus.wted.common.constant.SmsContent;
import com.blockbus.wted.core.user.dto.common.SmsDto;
import com.blockbus.wted.core.user.entity.Admin;
import com.blockbus.wted.core.user.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    private Logger logger = LoggerFactory.getLogger(RedisUtil.class);

    @Autowired
    private RedisTemplate<String,String> ssRedisTemplate;



    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 账户锁
     * @param userId
     * @return
     */
    public boolean accountLock(String userId,String value){
        return getLock(RedisConstant.ACCOUNT_LOCK+userId,value, RedisConstant.DEFAULT_LOCK_TIME_OUT);
    }
    public void accountUnlock(String userId,String value){
        unlock(RedisConstant.ACCOUNT_LOCK+userId,value);
    }

    /**
     * 基金购买锁
     * @param userName
     * @return
     */
    public boolean fundLock(String userName){
        return getLock(RedisConstant.FUND_LOCK+userName,userName, RedisConstant.DEFAULT_LOCK_TIME_OUT);
    }
    public void fundUnlock(String userName,String value){
        unlock(RedisConstant.FUND_LOCK+userName,value);
    }

    /**
     * 注册锁
     * @param userName
     * @return
     */
    public boolean registLock(String userName,String value){
        return getLock(RedisConstant.REGIST_LOCK+userName,value, RedisConstant.DEFAULT_LOCK_TIME_OUT);
    }
    public void registUnlock(String userName,String value){
        unlock(RedisConstant.REGIST_LOCK+userName,value);
    }



    public boolean getLock(String key,String value,long timeOut){
        //
        return ssRedisTemplate.opsForValue().setIfAbsent(key,value,timeOut,TimeUnit.SECONDS);

    }

    public void unlock(String key,String value) {
        //  超时或不一致不能删除
        String rValue = ssRedisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(rValue) && rValue.equals(value)){
            ssRedisTemplate.delete(key);
        }
    }



    /**
     * 获取当前登录用户（前台）
     * @return
     */
    public User getCurrentUser(){
        String userStr = getLoginEntityStr(RedisConstant.USER_PRE);
        User entity = null;
        try {
            entity = objectMapper.readValue(userStr, User.class);
        } catch (IOException e) {
            logger.error("redis 转换对象错误",e);
        }
        return entity;
    }

    /**
     * 获取当前登录用户（后台）
     * @return
     */
    public Admin getCurrentManager(){
        String managerStr = getLoginEntityStr(RedisConstant.MANAGER_PRE);
        Admin entity = null;
        try {
            entity = objectMapper.readValue(managerStr, Admin.class);
        } catch (IOException e) {
            logger.error("redis 转换对象错误",e);
        }
        return entity;
    }

    /**
     * 获取当前登录人字符串
     * @param pre
     * @return
     */
    public String getLoginEntityStr(String pre){
        String token = RequestUtil.getToken();
        if(StringUtils.isEmpty(token)){
            return null;
        }
        String managerId = token.split(CommonConstant.SPLIT_0)[1];
        return ssRedisTemplate.opsForValue().get(pre+managerId);
    }

    /**
     * 保存登录用户（后台）
     * @param token
     * @param managerEntity
     */
    public void setManagerToken(String token, Admin managerEntity){
        setStr(RedisConstant.TOKEN_PRE+managerEntity.getId(),token);
        setObj(RedisConstant.MANAGER_PRE+managerEntity.getId(),managerEntity);
    }

    /**
     * 保存登录用户（前台）
     * @param token
     * @param userEntity
     */
    public void setUserToken(String token, User userEntity){
        setStr(RedisConstant.TOKEN_PRE+userEntity.getId(),token);
        setObj(RedisConstant.USER_PRE+userEntity.getId(),userEntity);
    }


    public boolean checkToken(){
        String token = RequestUtil.getRequest().getHeader(CommonConstant.TOKEN_KEY);
        if(StringUtils.isEmpty(token)){
            return false;
        }
        String id = token.split(CommonConstant.SPLIT_0)[1];

        String rToken = getStr(RedisConstant.TOKEN_PRE+id);

        if(StringUtils.isEmpty(rToken)){
            return false;
        }
        if(rToken.equals(token)){
            return true;
        }
        return false;
    }

    /**
     * 保存手机验证码
     * @param dto
     */
    public void setMobileCode(SmsDto dto){
        String key = null;
        if(SmsContent.TYPE_REG.equals(dto.getType())){
            key = RedisConstant.MOBILE_CODE_REG_PRE;
        }
        if(SmsContent.TYPE_FORGET_PWD.equals(dto.getType())){
            key = RedisConstant.MOBILE_CODE_FORGET_PWD_PRE;
        }
        if(!StringUtils.isEmpty(key)){
            setStr(key, HelpUtil.randomIntStr(6), RedisConstant.MOBILE_CODE_TIMEOUT);
        }
    }

    /**
     * 获取手机验证码
     * @param mobileNo
     * @param type
     * @return
     */
    public String getMobileCode(String mobileNo,String type){
        if(SmsContent.TYPE_REG.equals(type)){
            return ssRedisTemplate.opsForValue().get(RedisConstant.MOBILE_CODE_REG_PRE+mobileNo);
        }
        if(SmsContent.TYPE_FORGET_PWD.equals(type)){
            return ssRedisTemplate.opsForValue().get(RedisConstant.MOBILE_CODE_FORGET_PWD_PRE+mobileNo);
        }
        return null;
    }


    public void setStr(String key,String value){
        setStr(key,value, RedisConstant.DEFAULT_TIME_OUT);
    }

    public void setStr(String key,String value,int seconds){
        setStr(key,value,seconds,TimeUnit.SECONDS);
    }

    public void setStr(String key,String value,int seconds,TimeUnit timeUnit){
        ssRedisTemplate.opsForValue().set(key,value, seconds, timeUnit);
    }


    public void setObj(String key,Object obj){
        setObj(key,obj, RedisConstant.DEFAULT_TIME_OUT);
    }

    public void setObj(String key,Object obj,int seconds){
        String objStr = null;
        try {
            objStr = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("RedisUitl 异常："+e);
        }
        if(!StringUtils.isEmpty(objStr)){
            setStr(key,objStr,seconds);
        }
    }

    public String getStr(String key){
        return ssRedisTemplate.opsForValue().get(key);
    }

    public void del(String key){
        ssRedisTemplate.delete(key);
    }

    public void expire(String key,int seconds){
        ssRedisTemplate.expire(key,seconds,TimeUnit.SECONDS);
    }

    public void expire(String key){
        ssRedisTemplate.expire(key, RedisConstant.DEFAULT_TIME_OUT,TimeUnit.SECONDS);
    }

    public void addSet(String key,String value){
        ssRedisTemplate.opsForSet().add(key,value);
    }

    public boolean isMember(String key,String value){
        return ssRedisTemplate.opsForSet().isMember(key,value);
    }

    /**
     * 生成唯一邀请码
     * @return
     */
    public String getIntroduceCode(){
        boolean suc = true;
        String value = null;
        while (suc){
            value = HelpUtil.randomIntStr(9);
            if(isMember(RedisConstant.INTRODUCE_CODE_KEY,value)){
                // todo 需要校验是否保存成功
                addSet(RedisConstant.INTRODUCE_CODE_KEY,value);
            }

        }
        return value;
    }


}
