package com.vityanchys.repository;

import com.vityanchys.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LogRepository extends JpaRepository<LogEntity, Integer> {
}
