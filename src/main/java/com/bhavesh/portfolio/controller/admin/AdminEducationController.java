package com.bhavesh.portfolio.controller.admin;

import com.bhavesh.portfolio.dto.request.EducationRequest;
import com.bhavesh.portfolio.entity.Education;
import com.bhavesh.portfolio.service.EducationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/education")
public class AdminEducationController {

    private final EducationService educationService;

    public AdminEducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @PostMapping
    public ResponseEntity<Education> createEducation(
            @Valid @RequestBody EducationRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(educationService.createEducation(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Education> updateEducation(
            @PathVariable Long id,
            @Valid @RequestBody EducationRequest request) {

        return ResponseEntity.ok(
                educationService.updateEducation(id, request)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducation(@PathVariable Long id) {

        educationService.deleteEducation(id);

        return ResponseEntity.noContent().build();
    }
}