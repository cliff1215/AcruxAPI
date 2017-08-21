package com.cloudpacs.acruxapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudpacs.acruxapi.models.Patient;
import com.cloudpacs.acruxapi.services.PatientService;

@CrossOrigin(maxAge = 3600)
@RestController
public class PatientController
{
    @Autowired
    private PatientService patService;
    
    @RequestMapping("/patient")
    public List<Patient> getAllPatients() 
    {
        return patService.getAllPatients();
    }
    
    @RequestMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable String id) 
    {
        return patService.getPatientById(id);
    }
}
