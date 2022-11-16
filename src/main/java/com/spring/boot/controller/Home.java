package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Home {

    @GetMapping("")
    public String doHome(){

        return "/WEB-INF/views/home/home.jsp";
    }

    @GetMapping("/study_reg")
    public String dostudy_reg(){

        return "/WEB-INF/views/home/study_reg.jsp";
    }
    @GetMapping("/member_list")
    public String domember_list(){

        return "/WEB-INF/views/home/study_reg.jsp";
    }
}

