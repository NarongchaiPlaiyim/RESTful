package com.ese;
 
import com.ese.model.DTOHello;
import com.ese.model.User;
import com.ese.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/hello")
public class HelloWorldService {
    private static UserService userService;

    //http://localhost:8080/rest/hello/Narongchai
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
        userService = new UserService();
        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user.toString());
        }

		String output = "Jersey say : " + msg;

        DTOHello dtoHello = new DTOHello();
        dtoHello.setMessage(output);
		return Response.status(200).entity(dtoHello.toString()).build();
 
	}
 
}