package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map){
        // 对传进来的参数进行简单判断
        if (!StringUtils.isEmpty(username) && password.equals("123456")){
            // 登录成功,反之表单重复提交，可以重定向到主页
            return "dashboard";
        }else {
            // 登录失败
            map.put("msg", "用户名密码错误");
            return "index";
        }
    }
}
