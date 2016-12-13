package com.vityanchys.service.Impl;

import com.vityanchys.entities.GroupEntity;
import com.vityanchys.repository.GroupRepository;
import com.vityanchys.service.Interface.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class GroupServiceImpl implements GroupService{

    private final GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Transactional(readOnly = true)
    public List<GroupEntity> getAllGroups(){
        return groupRepository.findAll();
    }
}
