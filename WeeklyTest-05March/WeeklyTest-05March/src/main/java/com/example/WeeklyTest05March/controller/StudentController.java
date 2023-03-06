package com.example.WeeklyTest05March.controller;

import com.example.WeeklyTest05March.model.Student;
import com.example.WeeklyTest05March.sarvice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(value="/save-student")
    public ResponseEntity saveStudent(@RequestBody Student student){
        studentService.saveStudnet(student);
        return new ResponseEntity<>("student saved", HttpStatus.CREATED);
    }
    @GetMapping(value="/student")
    public List<Student> StudentList(@RequestParam boolean active){
        return studentService.getStudent(active);
    }
}
