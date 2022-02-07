package com.example.CaseStudyMD4.object.repository;

import com.example.CaseStudyMD4.object.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Student, Long> {
}
