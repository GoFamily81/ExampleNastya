package com.example.example.service.impl;

import com.example.example.repository.UserRepository;
import com.example.example.service.UserService;
import com.example.example.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public String deleteUserById(Integer id) {
        userRepository.deleteById(id);
        return "user с id был удален: " + id;
    }

    @Override
    public User putUser(Integer id, User user) {
        user.setId(id);
        userRepository.save(user);
        return getUserById(id);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    @Override
    public String getUserByFlow(String flow, String slovo) {
        return "user был добавлен " + flow + " " + slovo;
    }

    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }
}
