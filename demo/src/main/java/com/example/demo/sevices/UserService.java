package com.example.demo.sevices;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //add a use
    public UserModel addUser(UserModel user){
        return userRepository.save(user);
    }

    // get all user
    public List<UserModel>getAllUsers(){
        return userRepository.findAll();
    }


    // get user by id
    public UserModel getUserById(String id){
        return userRepository.findById(id).get();
    }


    public String deleteUser(String id){
        userRepository.deleteById(id);

        return "user i deleted";

    }



}
