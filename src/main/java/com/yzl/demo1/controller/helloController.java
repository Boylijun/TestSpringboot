package com.yzl.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
    @RequestMapping("/index1")
    public String sayHello1(){

        return "index1";
    }
    @RequestMapping("/index2")
    public String sayHello2(){

        return "index2";
    }
}
