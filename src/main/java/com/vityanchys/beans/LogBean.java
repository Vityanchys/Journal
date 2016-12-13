package com.vityanchys.beans;

import com.vityanchys.entities.LogEntity;
import com.vityanchys.service.Interface.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("request")
public class LogBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    LogService logService;

    private List<LogEntity> allLogs;

    @PostConstruct
    public void init(){
        allLogs = logService.getAllLogs();
    }

    public List<LogEntity> getAllLogs() {
        return allLogs;
    }
}
