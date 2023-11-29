package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/student")
@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @PostMapping("")
    public Student createStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping("")
    public List<Student> getStudent(){
        return repository.findAll();
    }
}
