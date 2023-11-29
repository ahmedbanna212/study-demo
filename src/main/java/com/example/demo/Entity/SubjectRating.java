package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectRating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="student_id")
    private long student_id;
    @Column(name="subject_id")
    private long subject_id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="student_id",referencedColumnName = "id",insertable = false, updatable = false)
    private Student student;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="subject_id",referencedColumnName = "id",insertable = false, updatable = false)
    private Subject subject;
}


