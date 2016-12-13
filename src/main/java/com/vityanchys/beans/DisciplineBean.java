package com.vityanchys.beans;

import com.vityanchys.entities.DisciplineEntity;
import com.vityanchys.service.Interface.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("requset")
public class DisciplineBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    DisciplineService disciplineService;

    private List<DisciplineEntity> allDisciplines;

    @PostConstruct
    public void init(){
        allDisciplines = disciplineService.getAllDisciplines();
    }

    public List<DisciplineEntity> getAllDisciplines() {
        return allDisciplines;
    }
}
