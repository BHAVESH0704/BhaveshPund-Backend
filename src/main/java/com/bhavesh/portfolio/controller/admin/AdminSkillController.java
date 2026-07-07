package com.bhavesh.portfolio.controller.admin;

import com.bhavesh.portfolio.dto.request.SkillRequest;
import com.bhavesh.portfolio.entity.Skill;
import com.bhavesh.portfolio.service.SkillService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/skills")
public class AdminSkillController {

    private final SkillService skillService;

    public AdminSkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    // =========================
    // GET ALL
    // =========================

    @GetMapping
    public ResponseEntity<List<Skill>> getAllSkills() {

        return ResponseEntity.ok(
                skillService.getAllSkills()
        );

    }

    // =========================
    // CREATE
    // =========================

    @PostMapping
    public ResponseEntity<Skill> createSkill(
            @Valid @RequestBody SkillRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(skillService.createSkill(request));

    }

    // =========================
    // UPDATE
    // =========================

    @PutMapping("/{id}")
    public ResponseEntity<Skill> updateSkill(
            @PathVariable Long id,
            @Valid @RequestBody SkillRequest request) {

        return ResponseEntity.ok(
                skillService.updateSkill(id, request)
        );

    }

    // =========================
    // DELETE
    // =========================

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSkill(
            @PathVariable Long id) {

        skillService.deleteSkill(id);

        return ResponseEntity.noContent().build();

    }

}