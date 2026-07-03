package com.bhavesh.portfolio.controller;

import com.bhavesh.portfolio.dto.response.ContactResponse;
import com.bhavesh.portfolio.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/api/v1/contact")
    public ContactResponse getContact() {
        return contactService.getContact();
    }
}