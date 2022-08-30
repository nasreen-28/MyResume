package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class WorkExperience {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long WorkId;
    private String company;
    private String designation;
    private String startdate;
    private String enddate;
    private String tasks;
}
