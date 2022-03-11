package com.example.demo.handler;


import com.example.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestHandler {
    private static final Logger log = LoggerFactory.getLogger(TestHandler.class);

    @Autowired
    TestService asyncService;

    @Autowired
    private TestService service;

    @RequestMapping("/test")
    public Map<?,?> test() {
        return service.selectEmpInfo();
    }
}