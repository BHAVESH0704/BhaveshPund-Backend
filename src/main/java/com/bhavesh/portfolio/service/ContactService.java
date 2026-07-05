package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.request.ContactRequest;
import com.bhavesh.portfolio.dto.response.ContactResponse;
import com.bhavesh.portfolio.entity.Contact;
import com.bhavesh.portfolio.exception.ResourceNotFoundException;
import com.bhavesh.portfolio.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // =========================
    // Public API
    // =========================

    public ContactResponse getContact() {

        Contact contact = contactRepository.findFirstBy();

        return new ContactResponse(
                contact.getEmail(),
                contact.getPhone(),
                contact.getLinkedin(),
                contact.getGithub(),
                contact.getLocation()
        );
    }

    // =========================
    // Admin API - Update
    // =========================

    public Contact updateContact(ContactRequest request) {

        Contact contact = contactRepository.findFirstBy();

        if (contact == null) {
            throw new ResourceNotFoundException("Contact not found");
        }

        contact.setEmail(request.email());
        contact.setPhone(request.phone());
        contact.setLinkedin(request.linkedin());
        contact.setGithub(request.github());
        contact.setLocation(request.location());

        return contactRepository.save(contact);
    }
}