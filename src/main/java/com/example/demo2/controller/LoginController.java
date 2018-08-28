package com.example.demo2.controller;

import com.example.demo2.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;


public class LoginController {

    @Autowired
    public List<UserEntity> userList;

    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String name, @RequestParam("password") String pwd) {

        for (UserEntity user : userList) {

            if (user.getName().equals(name) && user.getPassword().equals(pwd)) {

                System.out.println("登录成功");

            } else {

                System.out.println("用户名或密码错误");

            }
        }
        return "index.jsp";

    }
}
