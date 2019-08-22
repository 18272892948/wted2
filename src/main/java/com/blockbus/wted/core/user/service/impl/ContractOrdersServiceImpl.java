package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.ContractOrderDao;
import com.blockbus.wted.core.user.entity.ContractOrder;
import com.blockbus.wted.core.user.service.ContractOrdersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购买的合约 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class ContractOrdersServiceImpl extends ServiceImpl<ContractOrderDao, ContractOrder> implements ContractOrdersService {
	
}
