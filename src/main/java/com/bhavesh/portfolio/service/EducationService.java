package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.response.EducationResponse;
import com.bhavesh.portfolio.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<EducationResponse> getEducation() {
        return educationRepository.findAll()
                .stream()
                .map(e -> new EducationResponse(
                        e.getDegree(),
                        e.getInstitute(),
                        e.getYear(),
                        e.getGrade()))
                .toList();
    }
}