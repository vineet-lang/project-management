package com.example.projectmanagement.controller;

import com.example.projectmanagement.model.User;
import com.example.projectmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/find/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }
}
