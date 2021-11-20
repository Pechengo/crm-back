package com.caece.crm.Client;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client, Integer>{
	List<Client> findAll();
	Client findById(int idclient);
	@SuppressWarnings("unchecked")
	Client save(Client client);
	void delete(Client client);
}
