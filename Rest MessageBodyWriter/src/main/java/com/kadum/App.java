package com.kadum;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("nice")
public class App {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		return "I love rest";
	}

}
