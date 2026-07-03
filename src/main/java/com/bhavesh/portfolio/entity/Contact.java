package com.bhavesh.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Contact {

    @Id
    private Long id;

    private String email;
    private String phone;
    private String linkedin;
    private String github;
    private String location;

    public Contact() {}

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getGithub() {
        return github;
    }

    public String getLocation() {
        return location;
    }
}