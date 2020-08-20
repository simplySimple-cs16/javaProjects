package com.kadum;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Singleton
@Path("app")
public class App {
	
	private int x = 0;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
        
		return "Counter value = " + (++x);
	}

}
