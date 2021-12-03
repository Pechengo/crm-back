package com.caece.crm.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	ClientRepo repo;
	
	@GetMapping("/clients")
	public List<Client> listar(){
		return repo.findAll();
	}
	
	//@GetMapping("/clients/{id}")
	//Client getById(@PathVariable ("id") int id) {
	//	return repo.findById(id);
	//}
	
	@PostMapping("/clients")
	void addClient(@RequestBody Client client) {
		repo.save(client);
	}
	
	@DeleteMapping(value = "/clients/delete{id}")
	private ResponseEntity<Boolean> deleteClient(@PathVariable ("id") int id) {
		repo.deleteById(id);
		return ResponseEntity.ok(!(repo.findById(id)!=null));
	}
	
	
	@PostMapping("/clients/update{id}")
	void updateClientbyId(@RequestBody Client client) {
		repo.save(client);
	}
		

}
