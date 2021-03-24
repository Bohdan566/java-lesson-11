package com.example.javalesson11.controllers;


import com.example.javalesson11.models.User;
import com.example.javalesson11.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {

    private UserService userService;

    @PostMapping("/save")
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("")
    public List<User> getUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
       return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteById(id);
    }

    @PostMapping("/update{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user){
        userService.update(id, user);
    }

}
