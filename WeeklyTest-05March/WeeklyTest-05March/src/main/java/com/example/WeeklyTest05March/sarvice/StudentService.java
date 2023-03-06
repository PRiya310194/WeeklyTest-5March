package com.example.WeeklyTest05March.sarvice;

import com.example.WeeklyTest05March.Repository.StudentRepository;
import com.example.WeeklyTest05March.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepo;


    public void saveStudnet(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getStudent(boolean active) {
        List<Student> studentList=studentRepo.findByActive(active);
        return studentList;
    }
}
