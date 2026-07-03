package com.bhavesh.portfolio.controller;

import com.bhavesh.portfolio.dto.response.EducationResponse;
import com.bhavesh.portfolio.service.EducationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/api/v1/education")
    public List<EducationResponse> getEducation() {
        return educationService.getEducation();
    }
}