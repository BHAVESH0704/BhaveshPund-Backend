package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.response.ContactResponse;
import com.bhavesh.portfolio.entity.Contact;
import com.bhavesh.portfolio.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

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
}