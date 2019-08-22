package com.blockbus.wted.core.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.TokenDao;
import com.blockbus.wted.core.user.entity.Token;
import com.blockbus.wted.core.user.service.TokensService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * API访问token 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class TokensServiceImpl extends ServiceImpl<TokenDao, Token> implements TokensService {
	
}
