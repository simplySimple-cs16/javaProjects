package com.kadum.showroom.services;

import java.util.List;

import com.kadum.showroom.DAO.ProductsDAO;
import com.kadum.showroom.model.Product;


public class ProductsService {

	ProductsDAO dao = new ProductsDAO();

	public List<Product> getProductsByBrand(int brandId) {
		List<Product> ProductList = dao.getProductsByBrand(brandId);
		return ProductList;
	}
	
	public List<Product> getProductsByBrandAndCategory(int brandId,String category) {
		List<Product> ProductList = dao.getProductsByBrandAndCategory(brandId, category);
		return ProductList;
	}
	
}
