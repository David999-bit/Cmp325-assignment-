package org.example.example.model.service;

import org.example.example.model.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);

    List<User> getAllUsers();
}
