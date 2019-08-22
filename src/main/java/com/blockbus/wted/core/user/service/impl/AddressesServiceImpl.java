package com.blockbus.wted.core.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.AddressDao;
import com.blockbus.wted.core.user.entity.Address;
import com.blockbus.wted.core.user.service.AddressesService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 充提币地址 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class AddressesServiceImpl extends ServiceImpl<AddressDao, Address> implements AddressesService {
	
}
