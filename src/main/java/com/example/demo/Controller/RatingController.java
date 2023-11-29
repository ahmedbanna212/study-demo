package com.example.demo.Controller;

import com.example.demo.Entity.SubjectRating;
import com.example.demo.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/subjectRating")
@RestController
public class RatingController {
    @Autowired
    private RatingRepository repository;
    @PostMapping
    public SubjectRating postRating(@RequestBody SubjectRating rating ){
        return repository.save(rating);
    }
}
