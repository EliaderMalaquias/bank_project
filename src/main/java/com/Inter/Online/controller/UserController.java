package com.Inter.Online.controller;

import com.Inter.Online.model.User;
import com.Inter.Online.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
