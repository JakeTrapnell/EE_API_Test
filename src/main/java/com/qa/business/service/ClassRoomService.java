package com.qa.business.service;

public interface ClassRoomService {
	
	String getAllClassRooms();
	String addClassRoom(String classRoom);
	String deleteClassRoom(Long id);
	String updateClassRoom(Long id, String classRoom);

}
