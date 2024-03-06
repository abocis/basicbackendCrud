package com.example.demo.repository;

import com.example.demo.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <UserModel, String> {


}
