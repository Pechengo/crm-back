package com.caece.crm.Sale;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepo extends CrudRepository<Sale, Integer>{
	List<Sale> findAll();
	Sale findById(int idSale);
	@SuppressWarnings("unchecked")
	Sale save(Sale sale);
	void delete(Sale sale);
	
	List<Sale> findAllByIdClientAndSaleDateBetween(Integer idClient, Date dateIni, Date dateFin);
}
