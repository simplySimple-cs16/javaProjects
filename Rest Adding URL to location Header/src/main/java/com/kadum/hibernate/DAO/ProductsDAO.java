package com.kadum.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kadum.showroom.hibernate.enitities.BrandEntity;
import com.kadum.showroom.hibernate.enitities.ProductEntity;


public class ProductsDAO {
	
	SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(ProductEntity.class)
            .addAnnotatedClass(BrandEntity.class)
            .buildSessionFactory();

	public List<ProductEntity> getProductsByBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String HQL  = "from products where brandId = '"+brandId+"'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}

	public List<ProductEntity> getProductsByBrandAndCategory(int brandId, String category) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String HQL  = "from products where brandId = '"+brandId+"' and category='"+category+"'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}



}