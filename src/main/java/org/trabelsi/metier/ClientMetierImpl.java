package org.trabelsi.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabelsi.dao.ClientRepository;
import org.trabelsi.entities.Client;
@Service
public class ClientMetierImpl implements ClientMetier{
	@Autowired
	private ClientRepository clientRepository;
	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}
	
}
