package com.vityanchys.entities;

import com.vityanchys.beans.GroupBean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {

    private static final long serialVersionUID = -5170875020617735653L;

    private int id;
    private String stName;
    private String stSurname;

    private GroupEntity groupTable;

    public StudentEntity() {
    }

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
    @Column(name = "st_name", nullable = false, length = 45)
    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    @Basic
    @Column(name = "st_surname", nullable = false, length = 45)
    public String getStSurname() {
        return stSurname;
    }

    public void setStSurname(String stSurname) {
        this.stSurname = stSurname;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", referencedColumnName = "id",nullable = false)
    public GroupEntity getGroupTable() {
        return groupTable;
    }

    public void setGroupTable(GroupEntity groupTable) {
        this.groupTable = groupTable;
    }
}
