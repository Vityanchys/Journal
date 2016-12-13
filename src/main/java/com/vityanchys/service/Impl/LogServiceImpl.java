package com.vityanchys.service.Impl;

import com.vityanchys.entities.LogEntity;
import com.vityanchys.repository.LogRepository;
import com.vityanchys.service.Interface.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LogServiceImpl implements LogService{

    private final LogRepository logRepository;

    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Transactional(readOnly = true)
    public List<LogEntity> getAllLogs(){
        return logRepository.findAll();
    }
}
