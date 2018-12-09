package io.veicot.openshift.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloService extends Application {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok(String.format("%s (feature/2 - %s)",
										 System.getenv("HELLO_STRING"),
										 System.getenv("HELLO_ENVIRONMENT"))).build();
	}
}
