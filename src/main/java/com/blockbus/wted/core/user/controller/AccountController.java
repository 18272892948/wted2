package com.blockbus.wted.core.user.controller;

import com.blockbus.wted.core.user.service.AccountsService;
import com.blockbus.wted.utils.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuweitao
 * @since 2019-08-20
 */
@RestController
@RequestMapping("/api/user")
public class AccountController {

    @Autowired
    private AccountsService accountsService;

    @RequestMapping("/count")
    public int count(){

        accountsService.getById(1);
        return accountsService.count();
    }



}
