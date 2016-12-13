package com.vityanchys.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "discipline", schema = "stlog")
public class DisciplineEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private String discName;

    private DisciplineEntity disciplineEntity;

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
    @Column(name = "disc_name", nullable = false, length = 45)
    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "log_id", referencedColumnName = "id", nullable = false)
    public DisciplineEntity getDisciplineEntity() {
        return disciplineEntity;
    }

    public void setDisciplineEntity(DisciplineEntity disciplineEntity) {
        this.disciplineEntity = disciplineEntity;
    }
}
