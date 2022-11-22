package com.lk.demo.mongodb.mongo.repository;

import com.lk.demo.mongodb.mongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
