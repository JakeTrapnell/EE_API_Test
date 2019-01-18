package com.qa.persistence.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.mapping.Set;

@Entity
public class ClassRoom {


	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name= "ClassRoom_ID")
	private Long id;
	
	@OneToMany(mappedBy="associatedTrainee", cascade=CascadeType.ALL)
	private Set thisClassRoomstrainees;
	
	@Size(min= 2, max = 20)
	private String trainer;
	
	private Trainee ClassRoomTrainee;
	
	public ClassRoom(String trainer, Trainee ClassRoomTrainee) {
		this.trainer = trainer;
		this.ClassRoomTrainee = ClassRoomTrainee;
		
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
	
	public Trainee getClassRoomTrainee() {
		return ClassRoomTrainee;
	}
	
	public void setClassRoomTrainee(Trainee ClassRoomTrainee) {
		this.ClassRoomTrainee = ClassRoomTrainee;
	}
	
}
