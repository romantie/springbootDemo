package com.lmk.springdemo.controller;

import com.lmk.springdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private User user;

    @GetMapping("/test")
    public String test(){
        return "hello spring";
    }

    @GetMapping("/user")
    public User user(){
        return user;
    }

    @Value("${aliyun}")
    private String aliyun;
    @GetMapping("aliyun")
    public String aliyun(){
        return aliyun;
    }
}
