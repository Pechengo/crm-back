package com.caece.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.caece.crm.Sale.Sale;
import com.caece.crm.Sale.SaleRepo;

import java.util.List;

@SpringBootTest
class CrmBackApplicationTests {
	@Autowired
	SaleRepo repo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testCallFalopita() {
		List<Sale> sales = repo.findAllByIdClientAndSaleDateBetween(1, null, null);
		Assert.notEmpty(sales);
	}

}
