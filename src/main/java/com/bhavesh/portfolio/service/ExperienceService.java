package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.response.ExperienceResponse;
import com.bhavesh.portfolio.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    private final ExperienceRepository repository;

    public ExperienceService(ExperienceRepository repository) {
        this.repository = repository;
    }

    public List<ExperienceResponse> getExperience() {
        return repository.findAll()
                .stream()
                .map(e -> new ExperienceResponse(
                        e.getCompany(),
                        e.getRole(),
                        e.getDuration(),
                        e.getDescription()
                ))
                .toList();
    }
}