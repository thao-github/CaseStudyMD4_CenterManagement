package com.example.CaseStudyMD4.object.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    private List<Class> classList;

    @OneToMany
    private List<Student> studentList;

    private String reflection;
}
