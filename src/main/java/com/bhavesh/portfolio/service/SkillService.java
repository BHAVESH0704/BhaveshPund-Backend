package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.request.SkillRequest;
import com.bhavesh.portfolio.dto.response.SkillResponse;
import com.bhavesh.portfolio.entity.Skill;
import com.bhavesh.portfolio.exception.ResourceNotFoundException;
import com.bhavesh.portfolio.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    // =========================
    // Public API
    // =========================

    public List<SkillResponse> getSkills() {

        return skillRepository.findAll()
                .stream()
                .map(skill -> new SkillResponse(
                        skill.getName(),
                        skill.getCategory()
                ))
                .toList();
    }

    // =========================
    // Admin API - Get All
    // =========================

    public List<Skill> getAllSkills() {

        return skillRepository.findAll();

    }

    // =========================
    // Admin API - Create
    // =========================

    public Skill createSkill(SkillRequest request) {

        Skill skill = new Skill();

        skill.setName(request.name());
        skill.setCategory(request.category());

        return skillRepository.save(skill);
    }

    // =========================
    // Admin API - Update
    // =========================

    public Skill updateSkill(Long id, SkillRequest request) {

        Skill skill = skillRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Skill not found"));

        skill.setName(request.name());
        skill.setCategory(request.category());

        return skillRepository.save(skill);
    }

    // =========================
    // Admin API - Delete
    // =========================

    public void deleteSkill(Long id) {

        if (!skillRepository.existsById(id)) {
            throw new ResourceNotFoundException("Skill not found");
        }

        skillRepository.deleteById(id);
    }

}