package com.vityanchys.repository;

import com.vityanchys.entities.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupRepository extends JpaRepository<GroupEntity, Integer> {
}
