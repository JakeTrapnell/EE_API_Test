package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.apache.log4j.Logger;
import com.qa.business.service.ClassRoomService;

@Path("/classroom")
public class ClassRoomEndpoint {
	
	@Inject
	private ClassRoomService service;
	
	@Path("/json")
	@GET
	@Produces({"application/json"})
	public String getAllClassRooms() {
		return service.getAllClassRooms();
	}
	
	@Path("/json")
	@POST
	@Produces({"application/json"})
	public String addClassRoom(String classRoom) {
		return service.addClassRoom(classRoom);
	}
	
	@Path("json/{id}")
	@DELETE
	@Produces({"application/json"})
	public String deleteClassRoom(@PathParam("id") Long id) {
		return service.deleteClassRoom(id);
	}
	
	@Path("json/{id}")
	@POST
	@Produces({"application/json"})	
	public String updateclassRoom(@PathParam("id") Long id, String classRoom) {
		return service.updateClassRoom(id, classRoom);
	}
	
	public void setService(ClassRoomService service) {
		this.service = service;
	}
	

}
