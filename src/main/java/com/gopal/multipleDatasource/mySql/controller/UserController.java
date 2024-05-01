package com.gopal.multipleDatasource.mySql.controller;

import com.gopal.multipleDatasource.mySql.entity.User;
import com.gopal.multipleDatasource.mySql.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/user/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userRepo.findById(id).orElse(new User(0,"Random","Value"));
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }
    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }
}
