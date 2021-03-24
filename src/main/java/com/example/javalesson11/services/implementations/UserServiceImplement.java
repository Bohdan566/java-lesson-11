package com.example.javalesson11.services.implementations;


import com.example.javalesson11.dao.UserDAO;
import com.example.javalesson11.models.User;
import com.example.javalesson11.services.UserService;
import lombok.AllArgsConstructor;
import lombok.val;
import org.omg.CORBA.Any;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImplement implements UserService {

    private UserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User getUser(int id) {
        Optional<User> userById = userDAO.findById(id);
        return userById.orElse(null);
    }

    @Override
    public void deleteById(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public void update(int id, User user) {
        User one = userDAO.getOne(id);
        one.setName(user.getName());
        one.setUsername(user.getUsername());
        one.setEmail(user.getEmail());
        userDAO.save(one);
    }
}
