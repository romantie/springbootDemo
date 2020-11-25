package com.lmk.springdemo.service;

import com.lmk.springdemo.entity.User;

import java.util.List;

public interface LUserService {

    public User getUser(Integer id);
    public List<User> findAllUser();
    public List<User> findUsers(String userName, String note);
    public Integer insertUser(User user);
    public Integer deleteUser(Integer id);

}
