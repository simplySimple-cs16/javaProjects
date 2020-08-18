 package com.kadum.showroom.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kadum.showroom.hibernate.enitities.BrandEntity;
import com.kadum.showroom.services.BrandsService;


@Path("/showroom")
public class Brands {
	
	@GET
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public List<BrandEntity> getBrands() {
		List<BrandEntity> list  = new BrandsService().getBrands();
		return list;
	}

	@POST
	@Path("/brands")
	@Consumes(MediaType.TEXT_PLAIN)
	public void postBrands(BrandEntity brand) {
		new BrandsService().addBrand(brand);
	}
	
	@PUT
	@Path("/brands/{brandId}")
	@Consumes(MediaType.TEXT_PLAIN)
	public void putBrands(@PathParam("brandId")  int brandId, BrandEntity updatedBrand) {
		updatedBrand.setBrandId(brandId);
		new BrandsService().updateBrand(updatedBrand);
	}
	
	@DELETE
	@Path("/brands/{brandId}")
	@Consumes(MediaType.TEXT_PLAIN)
	public void deleteBrands(@PathParam("brandId") int brandId) {
		new BrandsService().deleteBrand(brandId);
	}

}
