package com.vityanchys.beans;

import com.vityanchys.entities.GroupEntity;
import com.vityanchys.service.Interface.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("request")
public class GroupBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    GroupService groupService;

    private List<GroupEntity> allGroups;

    @PostConstruct
    public void init(){
        allGroups = groupService.getAllGroups();
    }

    public List<GroupEntity> getAllGroups() {
        return allGroups;
    }
}

