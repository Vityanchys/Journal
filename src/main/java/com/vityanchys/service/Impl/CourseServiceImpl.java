package com.vityanchys.service.Impl;

import com.vityanchys.entities.CourseEntity;
import com.vityanchys.repository.CourseRepository;
import com.vityanchys.service.Interface.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Transactional(readOnly = true)
    public List<CourseEntity> getAllCourses(){
        return courseRepository.findAll();
    }
}
