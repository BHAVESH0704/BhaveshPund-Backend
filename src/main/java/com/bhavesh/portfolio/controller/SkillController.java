package com.bhavesh.portfolio.controller;

import com.bhavesh.portfolio.dto.response.SkillResponse;
import com.bhavesh.portfolio.service.SkillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/api/v1/skills")
    public List<SkillResponse> getSkills() {
        return skillService.getSkills();
    }
}