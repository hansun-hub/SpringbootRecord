package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")

public class login {
    @GetMapping("/login")
    public String doStudy_reg(){
        return "/WEB-INF/views/login/login.jsp";
    }
    @GetMapping("/member_join")
    public String doMember_join(){
        return "/WEB-INF/views/login/member_join.jsp";
    }
}
