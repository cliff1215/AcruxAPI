package com.cloudpacs.acruxapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudpacs.acruxapi.models.Image;
import com.cloudpacs.acruxapi.repositories.ImageRepository;

@Service
public class ImageService
{
    @Autowired
    private ImageRepository imgRepo;
    
    public List<Image> getAllImages() {
        List<Image> result = new ArrayList<>();
        imgRepo.findAll().forEach(result::add);
        return result;
    }
    
    public Image getImage(String id) {
        return imgRepo.findOne(id);
    }
    
    public List<Image> getImagesByExamId(String examId) {
        return imgRepo.findByExamIdOrderBySeriesIdAscOrderAsc(examId);
    }
}
