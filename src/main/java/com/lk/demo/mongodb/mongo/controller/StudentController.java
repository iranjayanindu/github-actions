package com.lk.demo.mongodb.mongo.controller;

import com.lk.demo.mongodb.mongo.model.Student;
import com.lk.demo.mongodb.mongo.service.StudentSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StudentController {

    private final StudentSerivce studentSerivce;

    @Autowired
    public StudentController(StudentSerivce studentSerivce) {
        this.studentSerivce = studentSerivce;
    }

    @PostMapping(path = "create/student", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        log.info("Request calling from controller| pass data : {}",student);
        return studentSerivce.addStudent(student);
    }
}
