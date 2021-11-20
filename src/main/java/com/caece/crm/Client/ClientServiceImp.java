package com.caece.crm.Client;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImp implements ClientService{
	@Autowired
	private ClientRepo repositorio;
	
	@Override
	public List<Client> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Client listarId(int idclient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client add(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client edit(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
