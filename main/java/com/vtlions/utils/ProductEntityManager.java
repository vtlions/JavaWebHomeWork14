package com.vtlions.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.vtlions.model.Product;

public class ProductEntityManager {
	EntityManager manager = Persistence.createEntityManagerFactory("shop").createEntityManager();

	public Product getProductById(int id) {

		return manager.find(Product.class, id);
	}

	public List<Product> getAllProducts() {
		TypedQuery<Product> namedQuery = manager.createNamedQuery("Product.getAll", Product.class);
		return namedQuery.getResultList();
	}
	
	public List<Product> getProductsByCategory() {
		
		TypedQuery<Product> namedQuery = manager.createNamedQuery("Product.getByCategory", Product.class);
		return namedQuery.getResultList();
	}

}
