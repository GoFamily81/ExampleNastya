package com.example.example.controller;

import com.example.example.service.UserService;
import com.example.example.user.User;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@SecurityRequirement(name = "techgeeknext-api")

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/book/")
    public String getUserByFlow(@RequestParam("flow") String flow, @RequestParam("slovo") String slovo) {
        return userService.getUserByFlow(flow, slovo);
    }

    @PostMapping("/post")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByUser(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }

    @PutMapping("/putuser/{id}")
    public User putUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.putUser(id, user);
    }

    @GetMapping("/all")
    public List<User> userList() {
        return userService.userList();
    }
}
