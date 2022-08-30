package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Languages {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long languageId;
    private String name;
    private String level;
}
