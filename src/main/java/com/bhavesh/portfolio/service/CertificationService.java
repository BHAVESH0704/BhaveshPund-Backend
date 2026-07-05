package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.request.CertificationRequest;
import com.bhavesh.portfolio.dto.response.CertificationResponse;
import com.bhavesh.portfolio.entity.Certification;
import com.bhavesh.portfolio.exception.ResourceNotFoundException;
import com.bhavesh.portfolio.repository.CertificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {

    private final CertificationRepository repository;

    public CertificationService(CertificationRepository repository) {
        this.repository = repository;
    }

    // =========================
    // Public API
    // =========================

    public List<CertificationResponse> getCertifications() {

        return repository.findAll()
                .stream()
                .map(c -> new CertificationResponse(
                        c.getTitle(),
                        c.getOrganization(),
                        c.getYear(),
                        c.getCredentialUrl()
                ))
                .toList();
    }

    // =========================
    // Admin API - Create
    // =========================

    public Certification createCertification(CertificationRequest request) {

        Certification certification = new Certification();

        certification.setTitle(request.title());
        certification.setOrganization(request.organization());
        certification.setYear(request.year());
        certification.setCredentialUrl(request.credentialUrl());

        return repository.save(certification);
    }

    // =========================
    // Admin API - Update
    // =========================

    public Certification updateCertification(Long id, CertificationRequest request) {

        Certification certification = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Certification not found"));

        certification.setTitle(request.title());
        certification.setOrganization(request.organization());
        certification.setYear(request.year());
        certification.setCredentialUrl(request.credentialUrl());

        return repository.save(certification);
    }

    // =========================
    // Admin API - Delete
    // =========================

    public void deleteCertification(Long id) {

        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Certification not found");
        }

        repository.deleteById(id);
    }
}