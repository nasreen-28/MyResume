package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ProjectDetails {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projectId;
    private String title;
    private String desc1;
    private String desc2;
   
}

