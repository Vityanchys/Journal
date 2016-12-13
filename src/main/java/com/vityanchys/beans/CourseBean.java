package com.vityanchys.beans;

import com.vityanchys.entities.CourseEntity;
import com.vityanchys.service.Interface.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;


@Component
@Scope("request")
public class CourseBean implements Serializable{
    private static final long serialVersionUID = 1L;

    @Autowired
    CourseService courseService;

    private List<CourseEntity> allCourses;

    @PostConstruct
    public void init(){
        allCourses = courseService.getAllCourses();
    }

    public List<CourseEntity> getAllCourses() {
        return allCourses;
    }
}
