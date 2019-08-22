package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.core.user.dao.ArticleDao;
import com.blockbus.wted.core.user.entity.Article;
import com.blockbus.wted.core.user.service.ArticlesService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 公告 服务实现类
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@Service
public class ArticlesServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticlesService {
	
}
