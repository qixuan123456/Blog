package com.qxx.service.impl;

import com.qxx.entity.User;
import com.qxx.mapper.UserMapper;
import com.qxx.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Xuan
 * @since 2021-11-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
