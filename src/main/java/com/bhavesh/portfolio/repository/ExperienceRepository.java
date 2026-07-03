package com.bhavesh.portfolio.repository;

import com.bhavesh.portfolio.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}