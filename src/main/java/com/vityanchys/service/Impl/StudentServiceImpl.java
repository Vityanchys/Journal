package com.vityanchys.service.Impl;


import com.vityanchys.entities.StudentEntity;
import com.vityanchys.repository.StudentRepository;
import com.vityanchys.service.Interface.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional(readOnly = true)
    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }
}
