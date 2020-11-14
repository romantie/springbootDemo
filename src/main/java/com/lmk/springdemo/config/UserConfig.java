package com.lmk.springdemo.config;

import com.lmk.springdemo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//代表当前类是一个配置类
public class UserConfig {

    @Bean
    public User user(){
        User user = new User();
        user.setName("藏三");
        user.setId(1);
        return user;
    }
}
