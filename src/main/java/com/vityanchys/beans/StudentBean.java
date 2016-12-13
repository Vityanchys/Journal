package com.vityanchys.beans;

import com.vityanchys.entities.StudentEntity;
import com.vityanchys.service.Interface.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("session")
public class StudentBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    StudentService studentService;

    private List<StudentEntity> allStudents;

    @PostConstruct
    public void init(){
        allStudents = studentService.getAllStudents();
    }

    public List<StudentEntity> getAllStudents() {
        return allStudents;
    }
}
