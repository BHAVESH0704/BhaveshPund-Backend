package com.bhavesh.portfolio.controller;

import com.bhavesh.portfolio.dto.response.ExperienceResponse;
import com.bhavesh.portfolio.service.ExperienceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExperienceController {

    private final ExperienceService service;

    public ExperienceController(ExperienceService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/experience")
    public List<ExperienceResponse> getExperience() {
        return service.getExperience();
    }
}