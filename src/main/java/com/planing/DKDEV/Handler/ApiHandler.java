package com.planing.DKDEV.Handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiHandler
{
    @GetMapping("api/check")
    public ResponseEntity<?> apiCheck()
    {
        return ResponseEntity.ok("Hello");
    }
}
