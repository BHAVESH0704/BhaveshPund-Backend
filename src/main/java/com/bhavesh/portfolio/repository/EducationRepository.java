package com.bhavesh.portfolio.repository;

import com.bhavesh.portfolio.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}