package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.AppVersionDao;
import com.blockbus.wted.core.user.entity.AppVersion;
import com.blockbus.wted.core.user.service.AppVersionsService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 版本更新 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class AppVersionsServiceImpl extends ServiceImpl<AppVersionDao, AppVersion> implements AppVersionsService {
	
}
