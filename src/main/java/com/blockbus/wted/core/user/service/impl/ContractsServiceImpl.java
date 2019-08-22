package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.ContractDao;
import com.blockbus.wted.core.user.entity.Contract;
import com.blockbus.wted.core.user.service.ContractsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 合约 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class ContractsServiceImpl extends ServiceImpl<ContractDao, Contract> implements ContractsService {
	
}
