package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.request.EducationRequest;
import com.bhavesh.portfolio.dto.response.EducationResponse;
import com.bhavesh.portfolio.entity.Education;
import com.bhavesh.portfolio.exception.ResourceNotFoundException;
import com.bhavesh.portfolio.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    // =========================
    // Public API
    // =========================

    public List<EducationResponse> getEducation() {

        return educationRepository.findAll()
                .stream()
                .map(e -> new EducationResponse(
                        e.getDegree(),
                        e.getInstitute(),
                        e.getYear(),
                        e.getGrade()
                ))
                .toList();
    }

    // =========================
    // Admin API - Get All
    // =========================

    public List<Education> getAllEducation() {

        return educationRepository.findAll();

    }

    // =========================
    // Admin API - Create
    // =========================

    public Education createEducation(EducationRequest request) {

        Education education = new Education();

        education.setDegree(request.degree());
        education.setInstitute(request.institute());
        education.setYear(request.year());
        education.setGrade(request.grade());

        return educationRepository.save(education);
    }

    // =========================
    // Admin API - Update
    // =========================

    public Education updateEducation(Long id, EducationRequest request) {

        Education education = educationRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Education not found"));

        education.setDegree(request.degree());
        education.setInstitute(request.institute());
        education.setYear(request.year());
        education.setGrade(request.grade());

        return educationRepository.save(education);
    }

    // =========================
    // Admin API - Delete
    // =========================

    public void deleteEducation(Long id) {

        if (!educationRepository.existsById(id)) {
            throw new ResourceNotFoundException("Education not found");
        }

        educationRepository.deleteById(id);
    }

}