package com.lk.demo.mongodb.mongo.service.impl;

import com.lk.demo.mongodb.mongo.model.Student;
import com.lk.demo.mongodb.mongo.repository.StudentRepository;
import com.lk.demo.mongodb.mongo.service.StudentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentServiceImpl implements StudentSerivce {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity<String> addStudent(Student student) {
        student.setCreated(LocalDateTime.now());
        studentRepository.save(student);
        return new ResponseEntity<>("student "+ student.getFirstName() +" Added", HttpStatus.OK);
    }
}
