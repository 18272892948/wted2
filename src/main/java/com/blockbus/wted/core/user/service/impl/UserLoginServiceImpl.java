package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.common.constant.AccountConstant;
import com.blockbus.wted.common.constant.SmsContent;
import com.blockbus.wted.common.enums.ErrorCodeEnum;
import com.blockbus.wted.config.exception.BusinessException;
import com.blockbus.wted.config.sys.Result;
import com.blockbus.wted.core.user.dao.UserDao;
import com.blockbus.wted.core.user.dto.user.UserLoginDto;
import com.blockbus.wted.core.user.dto.user.UserQueryDto;
import com.blockbus.wted.core.user.dto.user.UserRegistDto;
import com.blockbus.wted.core.user.dto.user.UserUpdatePwdDto;
import com.blockbus.wted.core.user.entity.User;
import com.blockbus.wted.core.user.service.UserLoginService;
import com.blockbus.wted.utils.HelpUtil;
import com.blockbus.wted.utils.MacMD5;
import com.blockbus.wted.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserLoginServiceImpl extends ServiceImpl<UserDao, User> implements UserLoginService {


    @Autowired
    private  UserDao userDao;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserLoginServiceImpl userLoginServiceImpl;


    @Override
    public Result regist(UserRegistDto dto) throws BusinessException {

     if(dto == null || StringUtils.isEmpty(dto.getMobileCode()) || StringUtils.isEmpty(dto.getPwd()) || StringUtils.isEmpty(dto.getUserName())){
            return Result.error(ErrorCodeEnum.PARAM_ERROR);
        }
     User user =new User();

     user.setMobile(dto.getUserName());
     user.setPasswordDigest(dto.getPwd());





        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("inviteCode",dto.getIntroduceCode());
        User user1 = userDao.selectOne(queryWrapper);





        user.setInviteCode(dto.getMobileCode());



         String lockStr = HelpUtil.lockValue();
        boolean isLock = redisUtil.registLock(dto.getUserName(),lockStr);
        if(!isLock){
            return Result.error(ErrorCodeEnum.MOBILE_ALREADY_REGIST);
        }

        // 验证手机验证码
        String rCode = redisUtil.getMobileCode(dto.getUserName(), SmsContent.TYPE_REG);
        if(StringUtils.isEmpty(rCode) || !dto.getMobileCode().equals(rCode)){
            return Result.error(ErrorCodeEnum.MOBILE_CODE_ERROR);
        }

        UserQueryDto queryDto  = new UserQueryDto();
        queryDto.setUserName(dto.getUserName());
        User userEntity = userFunction.info(queryDto);
        if(userEntity != null){
            return Result.error(ErrorCodeEnum.USER_REPEAT);
        }

        User introduceUser = null;
        User entity = new User();
        if(StringUtils.isEmpty(dto.getIntroduceCode())){
            queryDto = new UserQueryDto();
            queryDto.setIntroduceCode(dto.getIntroduceCode());
            introduceUser = userFunction.info(queryDto);
            if(introduceUser == null){
                return Result.error(ErrorCodeEnum.INVALID_INTRODUCE_USER);
            }
            entity.setLeftValue((introduceUser.getLeftValue()+introduceUser.getRightValue()+1)/2);
            //因只有追加，没有插入，此处只加1
            entity.setRightValue(entity.getLeftValue()+1);
            entity.setGrade(introduceUser.getGrade()+1);
            entity.setIntroduceId(introduceUser.getId());
            if(StringUtils.isEmpty(introduceUser.getFirstIntroduceId())){
                entity.setFirstIntroduceId(introduceUser.getId());
            }else{
                entity.setFirstIntroduceId(introduceUser.getFirstIntroduceId());
            }

            // 修改直系
            UserLeftAndRightValueDto lrDto = new UserLeftAndRightValueDto();
            lrDto.setLeftValue(entity.getLeftValue());
            lrDto.setRightValue(entity.getRightValue());
            userFunction.updateDirectLine(lrDto);
            // 修改右系
            userFunction.updateRightLine(lrDto);
        }


        entity.setId(HelpUtil.createId());
        entity.setUserName(dto.getUserName());
        entity.setPwd(MacMD5.CalcMD5Member(dto.getPwd()));
        entity.setIntroduceCode(redisUtil.getIntroduceCode());
        entity.setCreatedAt(new DateTime());
        userFunction.save(entity);

        DictionaryQueryDto dicDto = new DictionaryQueryDto();
        dicDto.setCode(AccountConstant.CURRENCY_TYPE);
        List<Dictionary> dictionaryEntryList = dictionaryFunction.listNoPage(dicDto);
        if(CollectionUtils.isEmpty(dictionaryEntryList)){
            return Result.error(ErrorCodeEnum.CURRENCY_NO_EXIST);
        }
        List<String> currencyList = dictionaryEntryList.stream().map(Dictionary::getColumnKey).collect(Collectors.toList());

        accountFunction.saveEmptyAccountBatch(currencyList,userEntity.getId());

        redisUtil.registUnlock(dto.getUserName(),lockStr);
        return Result.ok();






        return null;
    }

    @Override
    public Result login(UserLoginDto dto) throws BusinessException {

        if(dto == null || StringUtils.isEmpty(dto.getUserName()) || StringUtils.isEmpty(dto.getPwd())){
            return Result.error(ErrorCodeEnum.PARAM_ERROR);
        }

        UserQueryDto queryDto = new UserQueryDto();
        queryDto.setUserName(dto.getUserName());



        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("mobile",queryDto.getUserName());
        User user = userDao.selectOne(queryWrapper);

if(user==null){
    return Result.error(ErrorCodeEnum.NAME_OR_PWD_ERROR);
}
        if(!user.getPasswordDigest().equals(MacMD5.CalcMD5Member(dto.getPwd()))){
            return Result.error(ErrorCodeEnum.NAME_OR_PWD_ERROR);
        }
        //User userEntity = userFunction.info(queryDto);
    /*    if(userEntity == null){
            return Result.error(ErrorCodeEnum.NAME_OR_PWD_ERROR);
        }
        if(!userEntity.getPwd().equals(MacMD5.CalcMD5Member(dto.getPwd()))){
            return Result.error(ErrorCodeEnum.NAME_OR_PWD_ERROR);
        }*/

      /*  String token = HelpUtil.createToken(user.getId());

        redisUtil.setUserToken(token,userEntity);

        userEntity.setPwd(null);
        userEntity.setPayPwd(null);

        UserResp userResp = (UserResp)userEntity;
        userResp.setToken(token);*/

        return Result.ok(user.getId());



    }

    @Override
    public Result forgetPwd(UserUpdatePwdDto dto) throws BusinessException {


        userLoginServiceImpl.updatePwd(dto);

        return null;
    }

    @Override
    public Result updatePwd(UserUpdatePwdDto dto) throws BusinessException {
       if(dto == null || StringUtils.isEmpty(dto.getNewPwd()) || StringUtils.isEmpty(dto.getUserName())
                || StringUtils.isEmpty(dto.getOldPwd()) || StringUtils.isEmpty(dto.getType())){
            return Result.error(ErrorCodeEnum.PARAM_ERROR);
        }
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("mobile",dto.getUserName());


        User user=new User();

        user.setPasswordDigest(dto.getNewPwd());

        userDao.update(user,queryWrapper);


        return Result.ok();
    }
}
