package com.test.Instagram_App.controller;

import com.test.Instagram_App.model.User;
import com.test.Instagram_App.service.UserService;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //sign up user
    @PostMapping("signup")
    public String SignUp(@RequestBody User user) {
        return userService.SignUp(user);
    }

    //get all user
    @GetMapping("users")
    public Iterable getAllUsers(){
        return  userService.getAllUsers();
    }
}
