package com.blockbus.wted.core.user.service;

import com.blockbus.wted.config.exception.BusinessException;
import com.blockbus.wted.config.sys.Result;
import com.blockbus.wted.core.user.dto.user.UserLoginDto;
import com.blockbus.wted.core.user.dto.user.UserRegistDto;
import com.blockbus.wted.core.user.dto.user.UserUpdatePwdDto;

public interface UserLoginService {

    Result regist(UserRegistDto dto) throws BusinessException;
    Result login(UserLoginDto dto) throws BusinessException;
    Result forgetPwd(UserUpdatePwdDto dto) throws BusinessException;
    Result updatePwd(UserUpdatePwdDto dto) throws BusinessException;
    }
