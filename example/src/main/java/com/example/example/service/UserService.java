package com.example.example.service;

import com.example.example.user.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    String deleteUserById(Integer id);

    User putUser(Integer id, User user);

    User getUserById(Integer id);

    String getUserByFlow(String flow, String slovo);

    List<User> userList();
}
