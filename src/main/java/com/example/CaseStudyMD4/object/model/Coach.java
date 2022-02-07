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
    private String description;
    private String email;
    private String phone;

    @OneToMany
    private List<Class> classList;

    @OneToMany
    private List<Student> studentList;

    private String reflection;
}
