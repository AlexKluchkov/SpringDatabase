package com.springdatabase.DatabaseSpring.service;

import com.springdatabase.DatabaseSpring.entity.User;
import com.springdatabase.DatabaseSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService
{
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
