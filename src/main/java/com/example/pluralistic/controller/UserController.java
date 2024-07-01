package com.example.pluralistic.controller;

import com.example.pluralistic.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping("/save")
    public String saveUser(User user) {

    }
}
