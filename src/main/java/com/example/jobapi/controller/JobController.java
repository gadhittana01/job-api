package com.example.jobapi.controller;

import com.example.jobapi.models.AuthenticationResponse;
import com.example.jobapi.models.Job;
import com.example.jobapi.models.RegisterRequest;
import com.example.jobapi.service.JobService;
import com.example.jobapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/job")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;
    @GetMapping("/")
    public ResponseEntity<List<Job>> getAllJob(){
        return ResponseEntity.ok(jobService.getAllJob());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getAllJob(@PathVariable("id") String id){
        return ResponseEntity.ok(jobService.getJobByID(id));
    }
}
