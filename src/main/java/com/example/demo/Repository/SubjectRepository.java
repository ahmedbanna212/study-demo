package com.example.demo.Repository;

import com.example.demo.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
