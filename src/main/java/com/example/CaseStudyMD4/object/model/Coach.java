package com.example.CaseStudyMD4.object.model;

import com.example.CaseStudyMD4.login.model.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("Coach")
public class Coach extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String phone;
    private String img;

    @OneToMany
    private List<Class> classList;

    @OneToMany
    private List<Student> studentList;

    private String reflection;
}
