package com.bhavesh.portfolio.repository;

import com.bhavesh.portfolio.entity.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
}