package com.gsb.usersapi.controller;

import com.gsb.usersapi.model.User;
import com.gsb.usersapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;


    @PostMapping
    public ResponseEntity createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public ResponseEntity findAllUsers() {
        return userService.findAllUsers();
    }
}
