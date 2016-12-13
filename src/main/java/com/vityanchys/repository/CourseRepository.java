package com.vityanchys.repository;

import com.vityanchys.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
