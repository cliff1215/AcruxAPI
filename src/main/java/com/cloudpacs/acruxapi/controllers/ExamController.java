package com.cloudpacs.acruxapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudpacs.acruxapi.models.Exam;
import com.cloudpacs.acruxapi.services.ExamService;

@CrossOrigin(maxAge = 3600)
@RestController
public class ExamController
{
    @Autowired
    private ExamService examService;
    
    @RequestMapping("/exam")
    public List<Exam> getAllExams() {
        return examService.getAllExams();
    }
}
