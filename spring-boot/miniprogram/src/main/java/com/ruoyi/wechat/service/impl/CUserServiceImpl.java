package com.ruoyi.wechat.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ruoyi.wechat.entity.CUser;
import com.ruoyi.wechat.mapper.CUserMapper;
import com.ruoyi.wechat.service.ICUserService;
import org.springframework.stereotype.Service;

/**
 * 微信用户Service业务层处理
 *
 * @author ruoyi
 * @date 2020-10-28
 */
@Service
public class CUserServiceImpl extends ServiceImpl<CUserMapper, CUser> implements ICUserService {

}
