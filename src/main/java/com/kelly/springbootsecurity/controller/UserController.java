package com.kelly.springbootsecurity.controller;

import com.kelly.springbootsecurity.model.User;
import com.kelly.springbootsecurity.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping("/doSaveUser")
    public String doSaveUser (User entity) {
        userService.saveUser(entity);
        return "redirect:/";
    }

}
