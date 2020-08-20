package com.kadum;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.kadum.model.Brand;


public class App {
	
	
	static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client
			.target("http://localhost:8080/restHateoas3/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");
	
	
	public static void main(String[] args) {
		
		Response response = baseBrandURL.request(MediaType.APPLICATION_JSON)
				.post(Entity.json(new Brand("New brand 14")));
		System.out.println(response.toString());
		
	}

}