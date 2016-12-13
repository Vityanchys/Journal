package com.vityanchys.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "log", schema = "stlog")
public class LogEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private String logName;
    private String mark;

    private List<DisciplineEntity> disciplineEntities;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "log_name", nullable = false, length = 45)
    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    @Basic
    @Column(name = "mark", nullable = false, length = 45)
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    /*@OneToMany(fetch = FetchType.EAGER, mappedBy = "log")
    public List<DisciplineEntity> getDisciplineEntities() {
        return disciplineEntities;
    }

    public void setDisciplineEntities(List<DisciplineEntity> disciplineEntities) {
        this.disciplineEntities = disciplineEntities;
    }*/

    //public void addDiscipline(DisciplineEntity disciplineEntity){
      //  this.disciplineEntities.add(disciplineEntity);
    //}

}
