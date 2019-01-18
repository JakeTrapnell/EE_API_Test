package com.qa.persistence.repository;

public interface ClassRoomRepository {
	
	//crud!
	String createClassRoom(String classRoom);
	String getAllClassRooms();
	String deleteClassRoom(Long id);
	String updateClassRoom(Long id, String classRoom);
}
