package com.cloudpacs.acruxapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cloudpacs.acruxapi.models.Image;

public interface ImageRepository extends CrudRepository<Image, String>
{
    List<Image> findByExamIdOrderBySeriesIdAscOrderAsc(String examID);
}
