package com.cloudpacs.acruxapi.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudpacs.acruxapi.models.Image;
import com.cloudpacs.acruxapi.services.ImageService;

@CrossOrigin(maxAge = 3600)
@RestController
public class ImageController
{
    @Autowired
    private ImageService imgService;
    
    @RequestMapping("/image")
    public List<Image> getAllImages() {
        return imgService.getAllImages();
    }
    
    @RequestMapping("/image/{id:.+}")
    public Image getImage(@PathVariable String id) {
        return imgService.getImage(id);
    }
    
    @RequestMapping("/image/exam/{id:.+}")
    public List<Image> getImagesInExam(@PathVariable String id) {
        return imgService.getImagesByExamId(id);
    }
    
    @RequestMapping("/image/file/{id:.+}") 
    public String getImageFile(@PathVariable String id) throws IOException {
        Image img = imgService.getImage(id);
        if (img == null) 
            return "{}";
        
        System.out.println(img.getPath());
        return new String(Files.readAllBytes(Paths.get(img.getPath())));
    }
}
