package com.example.CaseStudyMD4.object.service;

import com.example.CaseStudyMD4.object.model.Coach;
import com.example.CaseStudyMD4.object.repository.CoachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoachServiceImpl implements ICoachService{
    @Autowired
    CoachRepo coachRepo;

    @Override
    public Optional<Coach> findById(long id) {
        return coachRepo.findById(id);
    }
}
