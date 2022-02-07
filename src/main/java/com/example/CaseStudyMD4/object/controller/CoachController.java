package com.example.CaseStudyMD4.object.controller;

import com.example.CaseStudyMD4.object.service.ICoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("api/home/coach")
public class CoachController {
    @Autowired
    ICoachService coachService;


}
