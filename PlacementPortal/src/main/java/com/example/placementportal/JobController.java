package com.example.placementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplicationRepository applicationRepository; // Naya Repository add kiya

    // 1. Saari Jobs dekhne ke liye
    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // 2. Nayi Job post karne ke liye (Admin)
    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    // 3. Student ki Application save karne ke liye
    @PostMapping("/apply")
    public Application applyForJob(@RequestBody Application application) {
        return applicationRepository.save(application);
    }
}