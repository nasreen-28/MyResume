package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Achievements {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long achievementId;
    private String name;
    private String description;
}
