package com.kadum;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("app")
public class App {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {    

         Client client = ClientBuilder.newClient();
         Response response =  client.target("http://localhost:8080/restHateoas3/showroom/brands/3").request().get(); 
         return response.toString();
	}

}