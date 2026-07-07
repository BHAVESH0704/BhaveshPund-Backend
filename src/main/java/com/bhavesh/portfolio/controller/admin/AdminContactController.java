package com.bhavesh.portfolio.controller.admin;

import com.bhavesh.portfolio.dto.request.ContactRequest;
import com.bhavesh.portfolio.entity.Contact;
import com.bhavesh.portfolio.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/contact")
public class AdminContactController {

    private final ContactService contactService;

    public AdminContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // =========================
    // GET
    // =========================

    @GetMapping
    public ResponseEntity<Contact> getContact() {

        return ResponseEntity.ok(
                contactService.getContactAdmin()
        );

    }

    // =========================
    // UPDATE
    // =========================

    @PutMapping
    public ResponseEntity<Contact> updateContact(
            @Valid @RequestBody ContactRequest request) {

        return ResponseEntity.ok(
                contactService.updateContact(request)
        );

    }

}