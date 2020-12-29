package com.ma.springbootmybatis;

import com.ma.springbootmybatis.mapper.UserMapper;
import com.ma.springbootmybatis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.findAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    void selectOne(){
        User user = userMapper.findById(1);
        System.out.println(user);
    }

    @Test
    void inert(){
        User user = new User();
        user.setPassword("何小晴");
        user.setPassword("123");
        int i = userMapper.insertUser(user);
        if(i > 0){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
    }

    @Test
    void update(){
        User user = new User();
        user.setId(2);
        user.setUsername("马小超");
        user.setPassword("10086");
        int i = userMapper.updateUser(user);
        if(i > 0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }

    @Test
    void delete(){
        int i = userMapper.deleteUser(1);
        if(i > 0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

}
