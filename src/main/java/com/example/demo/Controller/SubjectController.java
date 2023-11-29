package com.example.demo.Controller;


import com.example.demo.Entity.Subject;
import com.example.demo.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {
    @Autowired
    private SubjectRepository repository;


    @PostMapping
    public Subject createSubject(@RequestBody Subject subject){
        return repository.save(subject);
    }

    @GetMapping
    public List<Subject> getSubject(){
        return repository.findAll();
    }
}
