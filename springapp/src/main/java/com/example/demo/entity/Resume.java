package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_resume")
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ResumeId;
	private String name;
	private String jobTitle;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contact", referencedColumnName = "contactId")
	private ContactDetails contact;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hsc", referencedColumnName = "id")
	private HscEducation hsc;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ug", referencedColumnName = "id")
	private UgEducation ug;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ProjectDetails> projects;

	@OneToMany(cascade = CascadeType.ALL)
	private List<WorkExperience> workexp;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Achievements> achievements;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Participations> participations;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Certifications> certifications;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Languages> languages;

	@ElementCollection(targetClass = String.class)
	private List<String> areasofinterests;

	@ElementCollection(targetClass = String.class)
	private List<String> skills;
}
