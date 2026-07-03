package com.bhavesh.portfolio.repository;

import com.bhavesh.portfolio.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}