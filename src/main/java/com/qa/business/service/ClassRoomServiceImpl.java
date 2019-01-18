package com.qa.business.service;

import javax.inject.Inject;
import org.apache.log4j.Logger;
import com.qa.persistence.domain.ClassRoom;
import com.qa.persistence.repository.ClassRoomRepository;
import com.qa.util.JSONUtil;
import javassist.bytecode.analysis.Util;

public class ClassRoomServiceImpl implements ClassRoomService {
	
	@Inject
	private ClassRoomRepository repo;
	

	public String getAllClassRooms() {
		return repo.getAllClassRooms();
	}

	public String addClassRoom(String classRoom) {
		return repo.createClassRoom(classRoom);
	}

	public String deleteClassRoom(Long id) {
		return repo.deleteClassRoom(id);
	}

	public String updateClassRoom(Long id, String classRoom) {
		return repo.updateClassRoom(id, classRoom);
	}
	
	public void setRepo(ClassRoomRepository repo) {
		this.repo = repo;
	}

}
