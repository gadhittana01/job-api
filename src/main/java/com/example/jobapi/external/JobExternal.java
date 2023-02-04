package com.example.jobapi.external;

import com.example.jobapi.models.Job;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JobExternal {

    private static final String BASE_URL = "http://dev3.dansmultipro.co.id";
    private final RestTemplate restTemplate;
    public List<Job> getAllJob(){
        ResponseEntity<List<Job>> rateResponse =
                restTemplate.exchange(BASE_URL+"/api/recruitment/positions.json",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Job>>() {
                        });
        List<Job> jobs = rateResponse.getBody();
        return jobs;
    }

    public Job getJobByID(String id){
        ResponseEntity<Job> rateResponse =
                restTemplate.exchange(BASE_URL+"/api/recruitment/positions/"+id,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Job>() {
                        });
        Job job = rateResponse.getBody();
        return job;
    }
}
