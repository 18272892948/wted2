package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.UserDao;
import com.blockbus.wted.core.user.entity.User;
import com.blockbus.wted.core.user.service.UsersService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UserDao, User> implements UsersService {
	
}
