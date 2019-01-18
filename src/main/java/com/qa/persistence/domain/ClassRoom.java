package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class ClassRoom {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	
	@Size(min= 2, max = 20)
	private String trainer;
	
	public ClassRoom(String trainer) {
		this.trainer = trainer;
		
	}
	
	public ClassRoom() {
		
	}
	
	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
}
