package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.DictDao;
import com.blockbus.wted.core.user.entity.Dict;
import com.blockbus.wted.core.user.service.DictsService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据字典 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class DictsServiceImpl extends ServiceImpl<DictDao, Dict> implements DictsService {
	
}
