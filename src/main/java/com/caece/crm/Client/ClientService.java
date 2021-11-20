package com.caece.crm.Client;

import java.util.List;

public interface ClientService {
	List<Client> listar();
	Client listarId(int idclient);
	Client add(Client client);
	Client edit(Client client);
	Client delete(int idclient);
}
