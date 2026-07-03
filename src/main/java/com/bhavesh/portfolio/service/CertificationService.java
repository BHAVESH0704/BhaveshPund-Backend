package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.response.CertificationResponse;
import com.bhavesh.portfolio.repository.CertificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {

    private final CertificationRepository repository;

    public CertificationService(CertificationRepository repository) {
        this.repository = repository;
    }

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
}