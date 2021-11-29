package com.caece.crm.Product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer>{
	List<Product> findAll();
	Product findById(int idproduct);
	@SuppressWarnings("unchecked")
	Product save(Product product);
	void delete(Product product);
}
