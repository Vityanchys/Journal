package com.vityanchys.entities;

import sun.security.krb5.internal.Ticket;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "group", schema = "stlog")
public class GroupEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private String groupName;
    private CourseEntity courseByCourceId;

    private CourseEntity courseTable;

    private List<DisciplineEntity> disciplineEntities = new ArrayList<>();

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
    @Column(name = "group_name", nullable = false, length = 45)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cource_id", referencedColumnName = "id", nullable = false)
    public CourseEntity getCourseByCourceId() {
        return courseByCourceId;
    }

    public void setCourseByCourceId(CourseEntity courseByCourceId) {
        this.courseByCourceId = courseByCourceId;
    }

    @OneToMany(mappedBy = "log", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<DisciplineEntity> getDisciplineEntities() {
        return disciplineEntities;
    }

    public void setDisciplineEntities(List<DisciplineEntity> disciplineEntities) {
        this.disciplineEntities = disciplineEntities;
    }

    public void addDiscipline(DisciplineEntity disciplineEntity){
        this.disciplineEntities.add(disciplineEntity);
    }

}
