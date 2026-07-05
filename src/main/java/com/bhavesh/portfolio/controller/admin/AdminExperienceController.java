package com.bhavesh.portfolio.controller.admin;

import com.bhavesh.portfolio.dto.request.ExperienceRequest;
import com.bhavesh.portfolio.entity.Experience;
import com.bhavesh.portfolio.service.ExperienceService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/experience")
public class AdminExperienceController {

    private final ExperienceService experienceService;

    public AdminExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping
    public ResponseEntity<Experience> createExperience(
            @Valid @RequestBody ExperienceRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(experienceService.createExperience(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Experience> updateExperience(
            @PathVariable Long id,
            @Valid @RequestBody ExperienceRequest request) {

        return ResponseEntity.ok(
                experienceService.updateExperience(id, request)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExperience(@PathVariable Long id) {

        experienceService.deleteExperience(id);

        return ResponseEntity.noContent().build();
    }
}