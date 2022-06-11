package com.Week3.RabbitMQ.controller;

import com.Week3.RabbitMQ.model.User;
import com.Week3.RabbitMQ.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public void createUser(User user){
        userService.createUser(user);    }
}
