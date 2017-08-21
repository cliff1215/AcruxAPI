package com.cloudpacs.acruxapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cloudpacs.acruxapi.models.Exam;

public interface ExamRepository extends CrudRepository<Exam, String>
{

}
