package com.caece.crm.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping
public class ClientController {
	@Autowired
	ClientService service;
	
	@GetMapping({"/test"})
	public List<Client> listar(){
		return service.listar();
	}
	//@GetMapping({"/test"})
	//String holaMundo() {
	//	return "Por favor andá";
	//}
		

}
