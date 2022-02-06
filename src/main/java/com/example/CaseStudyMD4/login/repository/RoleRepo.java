package com.example.CaseStudyMD4.login.repository;

import com.example.CaseStudyMD4.login.model.ERole;
import com.example.CaseStudyMD4.login.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
