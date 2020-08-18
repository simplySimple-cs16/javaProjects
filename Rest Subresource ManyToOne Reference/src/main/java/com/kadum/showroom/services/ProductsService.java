package com.kadum.showroom.services;

import java.util.List;

import com.kadum.hibernate.DAO.ProductsDAO;
import com.kadum.showroom.hibernate.enitities.ProductEntity;


public class ProductsService {

	ProductsDAO dao = new ProductsDAO();

	public List<ProductEntity> getProductsByBrand(int brandId) {
		List<ProductEntity> ProductList = dao.getProductsByBrand(brandId);
		return ProductList;
	}
	
}
