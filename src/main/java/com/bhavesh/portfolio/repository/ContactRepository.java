package com.bhavesh.portfolio.repository;

import com.bhavesh.portfolio.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    Contact findFirstBy();

}