package com.cloudpacs.acruxapi.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="patient")
public class Patient implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    @Column(name="name", nullable=false)
    private String name;
    @Column(name="birth_date", nullable=true)
    private String birthDate;
    @Column(name="gender", nullable=true)
    private String gender;
    
    @OneToMany(targetEntity=Exam.class, mappedBy="patient")
    @JsonIgnoreProperties("patient")
    private List<Exam> exams;
    
    public Patient() {
        
    }
    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBirthDate()
    {
        return birthDate;
    }
    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public List<Exam> getExams()
    {
        return exams;
    }

    public void setExams(List<Exam> exams)
    {
        this.exams = exams;
    }
    
    
}
