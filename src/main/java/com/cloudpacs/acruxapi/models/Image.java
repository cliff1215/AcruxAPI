package com.cloudpacs.acruxapi.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    
    @Column(name = "exam_id", nullable = false)
    private String examId;
    @Column(name = "series_id", nullable = false)
    private String seriesId;
    
    @Column(name="number")
    private int number;
    @Column(name="acquisition_date")
    private Date acqDate;
    @Column(name="original_window")
    private int orgWindow;
    @Column(name="original_level")
    private int orgLevel;
    @Column(name="current_window")
    private int curWindow;
    @Column(name="current_level")
    private int curLevel;
    @Column(name="rotate")
    private int rotate;
    @Column(name="zoom_factor")
    private float zoomFactor;
    @Column(name="start_x")
    private int startX;
    @Column(name="start_y")
    private int startY;
    @Column(name="order")
    private int order;
    @Column(name="path")
    private String path;
    
    public Image() {
        
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getExamId()
    {
        return examId;
    }

    public void setExamId(String examId)
    {
        this.examId = examId;
    }

    public String getSeriesId()
    {
        return seriesId;
    }

    public void setSeriesId(String seriesId)
    {
        this.seriesId = seriesId;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

//    public Date getAcqDate()
//    {
//        return acqDate;
//    }
    public String getAcqDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.acqDate);
    }

    public void setAcqDate(Date acqDate)
    {
        this.acqDate = acqDate;
    }

    public int getOrgWindow()
    {
        return orgWindow;
    }

    public void setOrgWindow(int orgWindow)
    {
        this.orgWindow = orgWindow;
    }

    public int getOrgLevel()
    {
        return orgLevel;
    }

    public void setOrgLevel(int orgLevel)
    {
        this.orgLevel = orgLevel;
    }

    public int getCurWindow()
    {
        return curWindow;
    }

    public void setCurWindow(int curWindow)
    {
        this.curWindow = curWindow;
    }

    public int getCurLevel()
    {
        return curLevel;
    }

    public void setCurLevel(int curLevel)
    {
        this.curLevel = curLevel;
    }

    public int getRotate()
    {
        return rotate;
    }

    public void setRotate(int rotate)
    {
        this.rotate = rotate;
    }

    public float getZoomFactor()
    {
        return zoomFactor;
    }

    public void setZoomFactor(float zoomFactor)
    {
        this.zoomFactor = zoomFactor;
    }

    public int getStartX()
    {
        return startX;
    }

    public void setStartX(int startX)
    {
        this.startX = startX;
    }

    public int getStartY()
    {
        return startY;
    }

    public void setStartY(int startY)
    {
        this.startY = startY;
    }

    public int getOrder()
    {
        return order;
    }

    public void setOrder(int order)
    {
        this.order = order;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }
    
    
}
