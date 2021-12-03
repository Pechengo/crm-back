package com.caece.crm.Sale;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
public class SaleController {
	@Autowired
	SaleRepo repo;
	
	private Date getDate(String givenDate) {
		Date date = new Date();
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			date = dateFormat.parse(givenDate);
		} catch (ParseException e) {
			
		}
		return date;
	}
	
	@GetMapping("/sales")
	ResponseEntity<List<Sale>> listar(@RequestParam(required = false) Integer idClient, @RequestParam(required = false) String fIni, @RequestParam(required = false) String fFin){
		if (idClient==null) {
 			return ResponseEntity.ok(repo.findAll());
		}
		return ResponseEntity.ok(repo.findAllByIdClientAndSaleDateBetween(idClient, getDate(fIni), getDate(fFin)));
	}
	
	@PostMapping("/sales")
	void addSale(@RequestBody Sale sale) {
		repo.save(sale);
	}
	
	
	
}
