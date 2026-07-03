package com.bhavesh.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class About {

    @Id
    private Long id;

    private String name;
    private String role;
    private String college;
    private String degree;
    private String location;
    private String email;
}