package com.qa.business.service;

public interface ClassRoomService {
	
	String getAllClassRooms();
	String addClassRoom(String classRoom);
	String deleteClassRoom(Long id);
	String updateClassRoom(Long id, String classRoom);
	
	String getAllTrainees();
	String addTrainee(String trainee);
	String deleteTrainee(Long id);
	String updateTrainee(Long id, String trainee);

}
