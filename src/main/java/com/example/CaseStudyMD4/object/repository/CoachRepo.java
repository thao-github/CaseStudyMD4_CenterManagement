package com.example.CaseStudyMD4.object.repository;

import com.example.CaseStudyMD4.object.model.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepo extends CrudRepository<Coach, Long> {

}
