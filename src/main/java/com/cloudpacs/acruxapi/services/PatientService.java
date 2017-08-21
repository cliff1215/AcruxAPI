package com.cloudpacs.acruxapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudpacs.acruxapi.models.Patient;
import com.cloudpacs.acruxapi.repositories.PatientRepository;

@Service
public class PatientService
{
    @Autowired
    private PatientRepository patRepo;
    
    public List<Patient> getAllPatients() 
    {
        List<Patient> result = new ArrayList<>();
        patRepo.findAll().forEach(result::add);
        return result;
    }

    public Patient getPatientById(String id)
    {
        return patRepo.findOne(id);
    }
}
