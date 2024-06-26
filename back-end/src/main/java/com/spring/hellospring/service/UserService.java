package com.spring.hellospring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.hellospring.entity.User;

@Service
public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    User createUser(User user);

    User updateUser(long id, User user);

    void deleteUser(long id);
}
