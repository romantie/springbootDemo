package com.lmk.springdemo.service.impl;

import com.lmk.springdemo.dao.LUserDao;
import com.lmk.springdemo.entity.User;
import com.lmk.springdemo.service.LUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LUserServiceImpl implements LUserService {
    @Autowired
    private LUserDao userdao;

    @Override
    public User getUser(Integer id) {
        return userdao.getUser(id);
    }

    @Override
    public List<User> findAllUser() {
        return userdao.findAllUser();
    }

    @Override
    public List<User> findUsers(String userName, String note) {
        return userdao.findUser(userName, note);
    }

    @Override
    public Integer insertUser(User user) {
        return userdao.insertUser(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userdao.deleteUser(id);
    }
}
