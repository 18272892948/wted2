package com.blockbus.wted.core.user.service.function;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blockbus.wted.common.constant.UserConstant;
import com.blockbus.wted.common.enums.ErrorCodeEnum;
import com.blockbus.wted.config.exception.BusinessException;
import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.dao.UserDao;
import com.blockbus.wted.core.dto.user.UserLeftAndRightValueDto;
import com.blockbus.wted.core.dto.user.UserQueryDto;
import com.blockbus.wted.core.dto.user.UserUpdatePwdDto;
import com.blockbus.wted.core.entity.User;
import com.blockbus.wted.core.entity.resp.CountResp;
import com.blockbus.wted.core.user.dao.UserDao;
import com.blockbus.wted.core.user.dto.user.UserQueryDto;
import com.blockbus.wted.core.user.dto.user.UserUpdatePwdDto;
import com.blockbus.wted.core.user.entity.User;
import com.blockbus.wted.utils.BeanUtil;
import com.blockbus.wted.utils.MacMD5;
import com.blockbus.wted.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFunction {

    private Logger logger = LoggerFactory.getLogger(UserFunction.class);


    @Autowired
    private UserDao userDao;


    public void updatePwd(UserUpdatePwdDto dto, boolean checkOldPwd) throws BusinessException {
        UserQueryDto queryDto = new UserQueryDto();
        queryDto.setUserName(dto.getUserName());
        User entity = info(queryDto);

        if(entity == null){
            throw new BusinessException(ErrorCodeEnum.USER_NO_EXIST);
        }

        User update = new User();
        update.setMobile(dto.getUserName());
        if(UserConstant.PWD_TYPE_0.equals(dto.getType())){
            if(checkOldPwd && !MacMD5.CalcMD5Member(dto.getOldPwd()).equals(entity.getPasswordDigest())){
                throw new BusinessException(ErrorCodeEnum.NAME_OR_PWD_ERROR);
            }
            update.setPasswordDigest(MacMD5.CalcMD5Member(dto.getNewPwd()));


        }

        if(UserConstant.PWD_TYPE_1.equals(dto.getType())){
            if(checkOldPwd && !MacMD5.CalcMD5Member(dto.getOldPwd()).equals(entity.getPasswordDigest())){
                throw new BusinessException(ErrorCodeEnum.NAME_OR_PWD_ERROR);
            }
            update.setPasswordDigest(MacMD5.CalcMD5Member(dto.getNewPwd()));
        }

        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("login",dto.getUserName());

        int num = userDao.update(entity,queryWrapper);
        if(num != 1 ){
            throw new BusinessException(ErrorCodeEnum.FAIL);
        }
    }

   /* public User getUserByUserName(String userName){
        UserQueryDto userQueryDto = new UserQueryDto();
        userQueryDto.setUserName(userName);
        return info(userQueryDto);
    }*/

/*    public PageInfo<User> getGradeUserList(CommonParam commonParam, User entity, int grade){
        UserQueryDto dto = new UserQueryDto();
        if(commonParam != null){
            BeanUtil.copy(commonParam,dto);
        }
        dto.setLeftValue(entity.getLeftValue());
        dto.setRightValue(entity.getRightValue());
        if(StringUtils.isEmpty(entity.getFirstIntroduceId())){
            dto.setFirstIntroduceId(entity.getId());
        }else{
            dto.setFirstIntroduceId(entity.getFirstIntroduceId());
        }
        dto.setGrade(entity.getGrade()+grade);

        PageUtil.initPage(dto);
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<User> userEntityList = userDao.list(dto);
        return new PageInfo<>(userEntityList);
    }

    public List<String> getGradeUserIdList(User entity, int grade){
        UserQueryDto dto = new UserQueryDto();
        dto.setLeftValue(entity.getLeftValue());
        dto.setRightValue(entity.getRightValue());
        if(StringUtils.isEmpty(entity.getFirstIntroduceId())){
            dto.setFirstIntroduceId(entity.getId());
        }else{
            dto.setFirstIntroduceId(entity.getFirstIntroduceId());
        }
        dto.setGrade(entity.getGrade()+grade);

        List<User> userEntityList = userDao.list(dto);
        List<String> userIdList = new ArrayList<>();
        for(User en:userEntityList){
            userIdList.add(en.getId());
        }
        return userIdList;
    }

    public void save(User entity) throws BusinessException {
        int num = userDao.save(entity);
        if(num != 1){
            throw new BusinessException(ErrorCodeEnum.FAIL);
        }
    }

    public User info(UserQueryDto dto){
        return userDao.info(dto);
    }

    public PageInfo<User> list(UserQueryDto dto){
        if(dto == null){
            dto = new UserQueryDto();
        }
        PageUtil.initPage(dto);
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<User> userEntityList = userDao.list(dto);
        return new PageInfo<>(userEntityList);
    }

    public List<User> listNoPage(UserQueryDto dto){
        return userDao.list(dto);
    }


    public void updateDirectLine(UserLeftAndRightValueDto dto){
        int num = userDao.updateDirectLine(dto);
        logger.info("user修改直系："+num+"条，当前左右值分别为："+dto.getLeftValue()+"::"+dto.getRightValue());
    }

    public void updateRightLine(UserLeftAndRightValueDto dto){
        int num = userDao.updateRightLine(dto);
        logger.info("user修改右系："+num+"条，当前左右值分别为："+dto.getLeftValue()+"::"+dto.getRightValue());
    }

    public CountResp countByGradeResp(){
        return userDao.countByGradeResp();
    }*/

}
