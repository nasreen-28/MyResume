package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class HscEducation {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String degree;
    private String institute;
    private String startdate;
    private String enddate;
    private String percentage;
}
