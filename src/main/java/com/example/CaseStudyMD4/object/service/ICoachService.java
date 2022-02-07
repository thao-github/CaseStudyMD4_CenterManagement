package com.example.CaseStudyMD4.object.service;

import com.example.CaseStudyMD4.object.model.Coach;

import java.util.Optional;

public interface ICoachService {
    Optional<Coach> findById(long id);
}
