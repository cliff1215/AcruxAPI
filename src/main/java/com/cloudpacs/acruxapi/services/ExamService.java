package com.cloudpacs.acruxapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudpacs.acruxapi.models.Exam;
import com.cloudpacs.acruxapi.repositories.ExamRepository;

@Service
public class ExamService
{
    @Autowired
    private ExamRepository examRepo;
    
    public List<Exam> getAllExams() {
        List<Exam> result = new ArrayList<>();
        examRepo.findAll().forEach(result::add);
        return result;
    }
}
