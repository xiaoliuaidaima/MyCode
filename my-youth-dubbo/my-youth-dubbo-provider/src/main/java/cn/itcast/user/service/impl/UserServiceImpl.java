package cn.itcast.user.service.impl;


import cn.itcast.cloud.douboo.api.UserService;
import cn.itcast.cloud.douboo.domain.User;

import cn.itcast.user.mapper.UserMapper;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//dubbo服务提供者   标记注解使用全路径注册到nacos
@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}