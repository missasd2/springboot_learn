package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloContrller {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping({"/", "/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        // classpath:/templates/success.html
        map.put("hello", "你好");
        return "success";
    }

}
