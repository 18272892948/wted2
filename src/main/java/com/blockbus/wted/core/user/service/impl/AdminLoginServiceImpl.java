package com.blockbus.wted.core.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blockbus.wted.common.constant.ManagerConstant;
import com.blockbus.wted.common.enums.ErrorCodeEnum;
import com.blockbus.wted.config.exception.BusinessException;
import com.blockbus.wted.config.sys.Result;
import com.blockbus.wted.core.user.dao.AdminDao;
import com.blockbus.wted.core.user.entity.Admin;
import com.blockbus.wted.core.user.service.AdminLoginService;
import com.blockbus.wted.utils.HelpUtil;
import com.blockbus.wted.utils.MacMD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class AdminLoginServiceImpl extends ServiceImpl<AdminDao, Admin> implements AdminLoginService {








}
