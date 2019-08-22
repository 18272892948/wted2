package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.ContentDao;
import com.blockbus.wted.core.user.entity.Content;
import com.blockbus.wted.core.user.service.ContentsService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 公告内容 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class ContentsServiceImpl extends ServiceImpl<ContentDao, Content> implements ContentsService {
	
}
