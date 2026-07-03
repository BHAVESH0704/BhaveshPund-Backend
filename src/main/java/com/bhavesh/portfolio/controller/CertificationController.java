package com.bhavesh.portfolio.controller;

import com.bhavesh.portfolio.dto.response.CertificationResponse;
import com.bhavesh.portfolio.service.CertificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CertificationController {

    private final CertificationService service;

    public CertificationController(CertificationService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/certifications")
    public List<CertificationResponse> getCertifications() {
        return service.getCertifications();
    }
}