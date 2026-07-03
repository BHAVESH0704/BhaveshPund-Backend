package com.bhavesh.portfolio.repository;

import com.bhavesh.portfolio.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About, Long> {

    About findFirstBy();

}