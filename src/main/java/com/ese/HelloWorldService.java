package com.ese;
 
import com.ese.model.DTOHello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {

    //http://localhost:8080/rest/hello/Narongchai
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;

        DTOHello dtoHello = new DTOHello();
        dtoHello.setMessage(output);
		return Response.status(200).entity(dtoHello.toString()).build();
 
	}
 
}