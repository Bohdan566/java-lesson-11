package com.example.javalesson11.services;


import com.example.javalesson11.models.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();

    User getUser(int id);

    void deleteById(int id);

    void update(int id, User user);
}
