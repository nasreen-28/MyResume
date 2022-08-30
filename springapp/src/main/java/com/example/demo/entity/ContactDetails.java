package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ContactDetails {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long contactId; 
    private String email;
    private String location;
    private String github;
    private String mobile;
    private String linkedin;
    private String stackoverflow;
}
