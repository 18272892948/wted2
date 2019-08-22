package com.blockbus.wted.core.user.controller;


import com.blockbus.wted.config.exception.BusinessException;
import com.blockbus.wted.config.sys.Result;
import com.blockbus.wted.core.user.dto.user.UserLoginDto;
import com.blockbus.wted.core.user.dto.user.UserRegistDto;
import com.blockbus.wted.core.user.dto.user.UserUpdatePwdDto;
import com.blockbus.wted.core.user.service.UserLoginService;
import com.blockbus.wted.core.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@RestController
@RequestMapping("/api/user")
public class UserLoginController {

    @Autowired
private UsersService usersService;

    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("/register")
    public Result register (UserRegistDto dto) throws BusinessException {
        return  userLoginService.regist(dto);



    }

    @PostMapping("/login")
    public Result login(UserLoginDto dto) throws BusinessException {
        return userLoginService.login(dto);
    }

    @PostMapping("/forgetPwd")
    public Result forgetPwd(UserUpdatePwdDto dto) throws BusinessException {
        return userLoginService.updatePwd(dto);
    }


}
