package com.cloudpacs.acruxapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cloudpacs.acruxapi.models.Patient;


public interface PatientRepository extends CrudRepository<Patient, String>
{

}
