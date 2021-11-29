package com.caece.crm.Sale;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SaleRepo extends CrudRepository<Sale, Integer>{
	List<Sale> findAll();
	Sale findById(int idsale);
	@SuppressWarnings("unchecked")
	Sale save(Sale sale);
	void delete(Sale sale);
}
