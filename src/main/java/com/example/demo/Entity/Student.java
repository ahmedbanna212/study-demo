package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double GPA;
    private Integer credit;
    private String year;
    private String specialization;
    private String firstName;
    private String lastName;
    private Date DOB;
    private double age;
    @OneToMany(mappedBy = "student")
    private List<SubjectRating> ratings;
}
