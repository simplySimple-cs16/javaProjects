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
	static WebTarget baseBrandURL = client.target("http://localhost:8080/restHateoas3/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");

	public static void main(String[] args) {

		/*
		 * Getting list of brands
		 * 
		 * Brand[] response = baseBrandURL.request(MediaType.APPLICATION_JSON)
				.get(Brand[].class);
		
		for(Brand brand: response) {
			System.out.println(brand.displayBrand());
		}*/
		
		
		/*
		 * Getting specific Brand info
		 * Brand specificBrand = brandURL
				 			  .resolveTemplate("brandId", "4")
		                      .request()
		                      .get(Brand.class);
		System.out.println(specificBrand);*/
		
		/*
		 * Add new brand
		 * Response response = baseBrandURL
				        .request()
				        .post(Entity.json(new Brand("New brand 100")));
		System.out.println(response.readEntity(Brand.class).displayBrand());
		*/
		
		//Update a brand info
		
		/*Response response = brandURL
		        			.resolveTemplate("brandId", "4")
		        			.request(MediaType.APPLICATION_JSON)
		        			.put(Entity.json(new Brand("Yamaha")));
		System.out.println(response.getStatus());
		*/
		
		Response response = brandURL
   			.resolveTemplate("brandId", "12")
   			.request()
   			.delete();
        System.out.println(response.getStatus());
      
	}

}