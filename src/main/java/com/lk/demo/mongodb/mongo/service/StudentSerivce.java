package com.lk.demo.mongodb.mongo.service;

import com.lk.demo.mongodb.mongo.model.Student;
import org.springframework.http.ResponseEntity;

public interface StudentSerivce {
    ResponseEntity<String> addStudent(Student student);
}
