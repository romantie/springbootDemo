package com.ma.springbootmybatis.sevice.impl;

import com.ma.springbootmybatis.mapper.UserMapper;
import com.ma.springbootmybatis.pojo.User;
import com.ma.springbootmybatis.sevice.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
