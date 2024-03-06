package com.example.demo.controllers;


import com.example.demo.models.UserModel;
import com.example.demo.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    //add user

    @PostMapping()
    public UserModel userModel(@RequestBody UserModel user){
        return userService.addUser(user);
    }


    //get all user
    @RequestMapping()
    public List<UserModel>getAllUser(){
        return userService.getAllUsers();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserModel getUserById(@PathVariable String id){

        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}",  method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id){
        return userService.deleteUser(id);
    }


}
