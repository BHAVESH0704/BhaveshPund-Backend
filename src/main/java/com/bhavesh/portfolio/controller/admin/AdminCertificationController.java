package com.bhavesh.portfolio.controller.admin;

import com.bhavesh.portfolio.dto.request.CertificationRequest;
import com.bhavesh.portfolio.entity.Certification;
import com.bhavesh.portfolio.service.CertificationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/certifications")
public class AdminCertificationController {

    private final CertificationService certificationService;

    public AdminCertificationController(CertificationService certificationService) {
        this.certificationService = certificationService;
    }

    // =========================
    // GET ALL
    // =========================

    @GetMapping
    public ResponseEntity<List<Certification>> getAllCertifications() {

        return ResponseEntity.ok(
                certificationService.getAllCertifications()
        );

    }

    // =========================
    // CREATE
    // =========================

    @PostMapping
    public ResponseEntity<Certification> createCertification(
            @Valid @RequestBody CertificationRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(certificationService.createCertification(request));

    }

    // =========================
    // UPDATE
    // =========================

    @PutMapping("/{id}")
    public ResponseEntity<Certification> updateCertification(
            @PathVariable Long id,
            @Valid @RequestBody CertificationRequest request) {

        return ResponseEntity.ok(
                certificationService.updateCertification(id, request)
        );

    }

    // =========================
    // DELETE
    // =========================

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertification(
            @PathVariable Long id) {

        certificationService.deleteCertification(id);

        return ResponseEntity.noContent().build();

    }

}