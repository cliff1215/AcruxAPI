package com.cloudpacs.acruxapi.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="exam")
public class Exam implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    
    @Column(name="study_date")
    private Date studyDate;
    @Column(name="modality")
    private String modality;
    @Column(name="description")
    private String description;
    @Column(name="study_id")
    private String studyId;
    @Column(name="accession_no")
    private String accessionNo;
    @Column(name="bodypart")
    private String bodypart;
    @Column(name="default_layout_x")
    private int defLayoutX;
    @Column(name="default_layout_y")
    private int defLayoutY;
    @Column(name="series_count")
    private int seriesCount;
    @Column(name="image_count")
    private int imageCount;
    
    @ManyToOne
    @JoinColumn(name="patient_id")
    @JsonIgnoreProperties("exams")
    private Patient patient;
    
    public Exam() {
        
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getStudyDate() 
    {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.studyDate);
    }

//    public Date getStudyDate()
//    {
//        return studyDate;
//    }

    public void setStudyDate(Date studyDate)
    {
        this.studyDate = studyDate;
    }

    public String getModality()
    {
        return modality;
    }

    public void setModality(String modality)
    {
        this.modality = modality;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getStudyId()
    {
        return studyId;
    }

    public void setStudyId(String studyId)
    {
        this.studyId = studyId;
    }

    public String getAccessionNo()
    {
        return accessionNo;
    }

    public void setAccessionNo(String accessionNo)
    {
        this.accessionNo = accessionNo;
    }

    public String getBodypart()
    {
        return bodypart;
    }

    public void setBodypart(String bodypart)
    {
        this.bodypart = bodypart;
    }

    public int getDefLayoutX()
    {
        return defLayoutX;
    }

    public void setDefLayoutX(int defLayoutX)
    {
        this.defLayoutX = defLayoutX;
    }

    public int getDefLayoutY()
    {
        return defLayoutY;
    }

    public void setDefLayoutY(int defLayoutY)
    {
        this.defLayoutY = defLayoutY;
    }

    public int getSeriesCount()
    {
        return seriesCount;
    }

    public void setSeriesCount(int seriesCount)
    {
        this.seriesCount = seriesCount;
    }

    public int getImageCount()
    {
        return imageCount;
    }

    public void setImageCount(int imageCount)
    {
        this.imageCount = imageCount;
    }
    
    public Patient getPatient()
    {
        return patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }
    
}
