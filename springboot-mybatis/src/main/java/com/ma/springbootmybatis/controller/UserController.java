package com.ma.springbootmybatis.controller;

import com.alibaba.fastjson.JSON;
import com.ma.springbootmybatis.pojo.User;
import com.ma.springbootmybatis.sevice.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    public String findAllUser(){
        List<User> users = userService.findAllUser();
        String res = JSON.toJSON(users).toString();
        return res;
    }

    @GetMapping("/findOne/{id}")
    public String findOneUser(@PathVariable("id") Integer id){
        User user = userService.findById(id);
        String res = JSON.toJSON(user).toString();
        return res;
    }

    @RequestMapping("/insert")
    public String  insert(){
        User user = new User();
        user.setUsername("何晴");
        user.setPassword("123");
        int i = userService.insertUser(user);
        if(i > 0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }
}
