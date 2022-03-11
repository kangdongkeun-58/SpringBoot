package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.example.demo.mapper.TesttMapper;


@Service
public class TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private TesttMapper testtMapper;

    public Map<?,?> selectEmpInfo() {
        return testtMapper.selectEmpInfo();
    }
}