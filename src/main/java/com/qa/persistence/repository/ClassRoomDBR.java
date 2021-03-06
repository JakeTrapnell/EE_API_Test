package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.ClassRoom;
import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;


@Transactional(SUPPORTS)
@Default
public class ClassRoomDBR implements ClassRoomRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	

	@Transactional(REQUIRED)
	public String createClassRoom(String classRoom) {
		ClassRoom aClassRoom = util.getObjectForJSON(classRoom, ClassRoom.class);
		manager.persist(aClassRoom);
		return "{\\\"message\\\": \\\"Class Room has been sucessfully added\\\"}";
	}

	@Transactional(REQUIRED)
	public String getAllClassRooms() {
		Query query = manager.createQuery("Select a FROM ClassRoom a");
		Collection<ClassRoom> classRooms = (Collection<ClassRoom>) query.getResultList();
		return util.getJSONForObject(classRooms);
	}

	@Transactional(REQUIRED)
	public String deleteClassRoom(Long id) {
		ClassRoom classRoomInDB = findClassRoom(id);
		if(classRoomInDB != null) {
			manager.remove(classRoomInDB);
		}
		return "{\"message\": \"Class Room sucessfully deleted\"}";
	}
	
	@Transactional(REQUIRED)
	public String updateClassRoom(Long id, String classRoom) {
		
		ClassRoom theClassRoom = findClassRoom(id);
		manager.remove(theClassRoom);
		ClassRoom aClassRoom = util.getObjectForJSON(classRoom, ClassRoom.class);
		manager.persist(aClassRoom);
		return"{\\\"message\\\": \\\"Class Room sucessfully updated\\\"}";
	}
	
	private ClassRoom findClassRoom(Long id) {
		return manager.find(ClassRoom.class, id);
	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee aTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(aTrainee);
		return "{\"message\": \"Trainee has been sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	public String getAllTrainees() {
		Query query = manager.createQuery("Select a FROM Trainee a");
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainees);
	}

	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		Trainee traineeInDB = findTrainee(id);
		if(traineeInDB != null) {
			manager.remove(traineeInDB);
		}
		return "{\"message\": \"Trainee sucessfully deleted\"}";
	}

	@Transactional(REQUIRED)
	public String updateTrainee(Long id, String trainee) {
		Trainee theTrainee = findTrainee(id);
		manager.remove(theTrainee);
		Trainee aTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(aTrainee);
		return"{\\\"message\\\": \\\"Trainee sucessfully updated\\\"}";
	}
	
	private Trainee findTrainee(Long id) {
		return manager.find(Trainee.class, id);
	}

}
