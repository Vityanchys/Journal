package com.vityanchys.repository;

import com.vityanchys.entities.DisciplineEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DisciplineRepository extends JpaRepository<DisciplineEntity, Integer> {
}
