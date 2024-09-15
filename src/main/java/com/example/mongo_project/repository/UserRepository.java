package com.example.mongo_project.repository;

import com.example.mongo_project.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
