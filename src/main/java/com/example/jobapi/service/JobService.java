package com.example.jobapi.service;

import com.example.jobapi.external.JobExternal;
import com.example.jobapi.models.AuthenticationResponse;
import com.example.jobapi.models.Job;
import com.example.jobapi.models.LoginRequest;
import com.example.jobapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobService {
    private final JobExternal jobExternal;

    public List<Job> getAllJob() {
       return jobExternal.getAllJob();
    }

    public Job getJobByID(String id) {
        return jobExternal.getJobByID(id);
    }
}
