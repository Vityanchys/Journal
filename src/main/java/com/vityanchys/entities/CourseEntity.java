package com.vityanchys.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "course", schema = "stlog")
public class CourseEntity implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String courseName;

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
    @Column(name = "course_name", nullable = false, length = 45)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
