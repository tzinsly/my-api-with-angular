package com.angular.study.myapi.controller;

import com.angular.study.myapi.bean.User;
import com.angular.study.myapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @GetMapping
    public List findAll(){
        return userService.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public User findById(@PathVariable("id") int id){
        return userService.findById(id);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }
}