package com.caece.crm.Product;

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
public class ProductController {
	@Autowired
	ProductRepo repo;
	
	@GetMapping("/products")
	public List<Product> listar(){
		return repo.findAll();
	}
	
	@PostMapping("/products")
	void addProduct(@RequestBody Product product) {
		repo.save(product);
	}
	
	@DeleteMapping(value="/products/delete{id}")
	private ResponseEntity<Boolean> deleteProduct(@PathVariable ("id") int id) {
		repo.deleteById(id);
		return ResponseEntity.ok(!(repo.findById(id)!=null));
	}
	
	@PostMapping("/products/update{id}")
	void updateProductById(@RequestBody Product product) {
		repo.save(product);
	}
}
