package com.caece.crm.Client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ClientController {
	@Autowired
	ClientRepo service;
	
	@GetMapping("/clients")
	public List<Client> listar(){
		return service.findAll();
	}
	
	@PostMapping("/clients")
	void addClient(@RequestBody Client client) {
		service.save(client);
	}

	@DeleteMapping(value = "/delete{id}")
	private ResponseEntity<Boolean> deleteClient(@PathVariable ("id") int id) {
		service.deleteById(id);
		return ResponseEntity.ok(!(service.findById(id)!=null));
	}
	
	
	@PostMapping("/update{id}")
	void updateClientbyId(@RequestBody Client client) {
		service.save(client);
	}
		

}
