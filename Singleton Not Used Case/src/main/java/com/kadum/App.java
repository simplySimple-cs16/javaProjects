package com.kadum;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("app/{demo}")
public class App {
	@QueryParam("x") String x;
	@PathParam("demo") String demo;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {    
		return "The value of x is "+x+" || The value of demo path param is "+demo;
	}

}