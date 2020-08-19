package com.kadum.showroom.services;

import java.util.List;

import com.kadum.hibernate.DAO.BrandsDAO;
import com.kadum.showroom.hibernate.enitities.BrandEntity;


public class BrandsService {

BrandsDAO DAO = new BrandsDAO();
	
	public List<BrandEntity> getBrands() {
		List<BrandEntity> list = DAO.getBrands();
		return list;
	}

	public void addBrand(BrandEntity brand) {
		DAO.addBrand(brand);
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		DAO.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		DAO.deleteBrand(brandId);
		
	}
	
	public BrandEntity getBrand(int brandId) {
		return DAO.getBrand(brandId);
	}
	
}
