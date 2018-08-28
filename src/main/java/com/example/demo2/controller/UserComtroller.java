package com.example.demo2.controller;

import com.example.demo2.dao.UserRepository;
import com.example.demo2.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserComtroller {

    @Autowired
    public UserRepository user;

    @GetMapping("user")
    public List<UserEntity> userEntities(){

        List<UserEntity> users = user.findAll();
        return users;

    }



}
