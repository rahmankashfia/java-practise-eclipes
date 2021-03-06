package com.apex.user.resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.tomcat.util.http.parser.MediaType;

import com.apex.user.service.UserService;
import com.apex.user.vo.User;

@Path("/user/v1")
public class UserResource {
	@GET
	@Path("/{id}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public User getUser(@PathParam("id") String id){
		UserService service = new UserService();
		System.out.println("User Response - Start");
		User user = service.getUser(Integer.parseInt(id));
		System.out.println("User Response - End");
		return user;
	}
}
