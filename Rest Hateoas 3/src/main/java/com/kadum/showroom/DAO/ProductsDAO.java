package com.kadum.showroom.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kadum.showroom.model.Brand;
import com.kadum.showroom.model.Product;


public class ProductsDAO {
	
	SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Product.class)
            .addAnnotatedClass(Brand.class)
            .buildSessionFactory();

	@SuppressWarnings("unchecked")
	public List<Product> getProductsByBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productList;
		String HQL  = "from products where brandId = '"+brandId+"'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProductsByBrandAndCategory(int brandId, String category) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Product> productList;
		String HQL  = "from products where brandId = '"+brandId+"' and category='"+category+"'";
		productList = session.createQuery(HQL).getResultList();
		return productList;
	}



}