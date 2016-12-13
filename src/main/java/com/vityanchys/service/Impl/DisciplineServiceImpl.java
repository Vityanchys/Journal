package com.vityanchys.service.Impl;

import com.vityanchys.entities.DisciplineEntity;
import com.vityanchys.repository.DisciplineRepository;
import com.vityanchys.service.Interface.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DisciplineServiceImpl implements DisciplineService{

    private final DisciplineRepository disciplineRepository;

    @Autowired
    public DisciplineServiceImpl(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    @Transactional(readOnly = true)
    public List<DisciplineEntity> getAllDisciplines(){
        return disciplineRepository.findAll();
    }
}
