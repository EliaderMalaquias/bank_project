package com.Inter.Online.controller;

import com.Inter.Online.model.User;
import com.Inter.Online.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/create")
    public User createUser(@RequestBody @Valid User user) {
        return userService.saveUser(user);
    }
}
