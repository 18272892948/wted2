package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.AdminDao;
import com.blockbus.wted.core.user.entity.Admin;
import com.blockbus.wted.core.user.service.AdminsService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台管理账户 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class AdminsServiceImpl extends ServiceImpl<AdminDao, Admin> implements AdminsService {
	
}
