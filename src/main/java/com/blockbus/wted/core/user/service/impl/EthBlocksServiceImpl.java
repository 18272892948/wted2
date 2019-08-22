package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.EthBlockDao;
import com.blockbus.wted.core.user.entity.EthBlock;
import com.blockbus.wted.core.user.service.EthBlocksService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 通过的区块号 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class EthBlocksServiceImpl extends ServiceImpl<EthBlockDao, EthBlock> implements EthBlocksService {
	
}
