package com.kadum.showroom.resources;

import javax.servlet.ServletContext;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.kadum.showroom.model.ErrorPayload;


@Path("/")
public class DemoResource {

	@Context
	private UriInfo uriInfo;

	@Context
	private ServletContext servletContext;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerAttrib,
			@CookieParam("_xsrf") String xsrf) {
		return "Hello Jas-rs";
		// return "Header Value: "+headerAttrib+ " Cookie _xsrf value: "+xsrf;
	}

	@GET
	   @Path("/demo")
	   @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
	   public String contextDemo(@HeaderParam("header") String header) throws Exception {
		
		   if(header == null) {
			   throw new NotFoundException();
		   }
		   return "The value of custom header value is : "+header;
	   }

}