package com.qa.persistence.repository;

public interface ClassRoomRepository {
	
	//crud!
	String createClassRoom(String classRoom);
	String getAllClassRooms();
	String deleteClassRoom(Long id);
	String updateClassRoom(Long id, String classRoom);
	
	String createTrainee(String trainee);
	String getAllTrainees();
	String deleteTrainee(Long id);
	String updateTrainee(Long id, String trainee);
}
