package com.kadum.showroom.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	
	@GET
	@Path("/getBrands")
	@Produces(MediaType.TEXT_PLAIN)	
	public String getBrands() {
		return "list of brands";
	}

}
