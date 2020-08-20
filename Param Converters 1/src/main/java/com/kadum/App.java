package com.kadum;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("app")
public class App {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(@QueryParam("code") Currency currency) {    
		return "The code of currency is :"+currency; //ParamConverterProvider will be called
	}

}