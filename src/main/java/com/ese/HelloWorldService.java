package com.ese;
 
import com.ese.model.DTOHello;
import com.ese.model.User;
import com.ese.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/hello")
public class HelloWorldService {
    private static UserService userService;

    @Inject
    private DTOHello dtoHello;

    //http://localhost:8080/rest/hello/Narongchai
	@GET
	@Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(@PathParam("param") String msg) {
        userService = new UserService();
        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user.toString());
        }

        User user = new User();
        user.setEmail("TEST");
        user.setActive(99);
        user = userService.findById(3);
        user.setEmail("N.Plaiyim@gmail.com");
        userService.updateUser(user);

//		String output = "Jersey say : " + msg;
//        dtoHello.setMessage(output);
        dtoHello = new DTOHello();
        dtoHello.setMessage("MESSAGE");
        dtoHello.setName("NAME");

//        ObjectMapper mapper = new ObjectMapper();
		return Response.status(200).entity(userList).build();

//        return dtoHello;
	}
 
}