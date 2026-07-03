package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.response.SkillResponse;
import com.bhavesh.portfolio.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<SkillResponse> getSkills() {

        return skillRepository.findAll()
                .stream()
                .map(skill -> new SkillResponse(
                        skill.getName(),
                        skill.getCategory()
                ))
                .toList();
    }
}