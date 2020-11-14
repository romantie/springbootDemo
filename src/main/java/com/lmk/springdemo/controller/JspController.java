package com.lmk.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class JspController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("name","zhanfsan");

        return "index";
    }
}
