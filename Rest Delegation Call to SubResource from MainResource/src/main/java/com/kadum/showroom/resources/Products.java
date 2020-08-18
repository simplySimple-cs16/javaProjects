package com.kadum.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kadum.showroom.hibernate.enitities.ProductEntity;
import com.kadum.showroom.services.ProductsService;


//@Path("/showroom/brands")
public class Products {
	
	ProductsService productsService = new ProductsService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductsByBrand(@PathParam("brandId") int brandId) {
		List<ProductEntity> ProductList = productsService.getProductsByBrand(brandId);
		return ProductList;
	}

}

