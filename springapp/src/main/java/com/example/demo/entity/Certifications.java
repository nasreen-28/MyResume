package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Certifications {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long certificationId;
    private String name;
    private String date;
}
