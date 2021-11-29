package com.caece.crm.Sale;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4040", maxAge=3600)
@RestController
public class SaleController {
	@Autowired
	SaleRepo repo;
	
	@GetMapping("/sales")
	public List<Sale> listar(){
		return repo.findAll();
	}
	
	@PostMapping("/sales")
	void addSale(@RequestBody Sale sale) {
		repo.save(sale);
	}
}
