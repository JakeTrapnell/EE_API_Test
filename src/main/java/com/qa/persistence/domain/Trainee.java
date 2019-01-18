package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class Trainee {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name= "Trainee_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ClassRoom_ID")	
	private ClassRoom associatedTrainee;
	
	@Size(min= 2, max= 20)
	private String traineeName;
	
	public Trainee(String traineeName) {
		this.traineeName = traineeName;
	}
	
	public Trainee() {
		
	}
	
	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

}
