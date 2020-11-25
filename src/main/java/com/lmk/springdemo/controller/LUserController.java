package com.lmk.springdemo.controller;

import com.lmk.springdemo.entity.User;
import com.lmk.springdemo.service.LUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class LUserController {
    @Autowired(required = false)
    private LUserService userService;

    // 1.通过URL传递参数
    @GetMapping("/{id}")
    // 相应为JSON数据集
    @ResponseBody
    // @PathVariable 通过参数名称获取参数
    public User get(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping("/list1")
    @ResponseBody
    public List<User> list1() {
        // 访问模型层得到数据
        List<User> users = userService.findAllUser();
        for (User user : users) {
            System.out.println(user.getUserName());
        }
        return users;
    }

    @RequestMapping("/list2")
    @ResponseBody
    public List<User> list2(@RequestParam(value = "userName", required = false) String userName,
                            @RequestParam(value = "note", required = false) String note)
    {
        // 访问模型层得到数据
        List<User> users = userService.findUsers(userName, note);
        for (User user : users) {
            System.out.println(user.getUserName());
        }
        return users;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Integer insert(@RequestParam(value = "userName", required = false) String userName,
                          @RequestParam(value = "note", required = false) String note)
    {
    // 访问模型层得到数据
        User user=new User();
        user.setUserName(userName);
        user.setNote(note);
        userService.insertUser(user);
        return user.getId();
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {
        return "删除数据["+userService.deleteUser(id)+"]条";
    }
}

