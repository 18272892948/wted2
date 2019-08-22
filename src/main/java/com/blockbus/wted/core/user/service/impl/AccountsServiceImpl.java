package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.AccountsDao;
import com.blockbus.wted.core.user.entity.Account;
import com.blockbus.wted.core.user.service.AccountsService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class AccountsServiceImpl extends ServiceImpl<AccountsDao, Account> implements AccountsService {
	
}
