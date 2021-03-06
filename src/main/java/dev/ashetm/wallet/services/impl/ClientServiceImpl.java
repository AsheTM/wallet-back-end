package dev.ashetm.wallet.services.impl;

import java.util.List;

import dev.ashetm.wallet.exceptions.ClientNotFoundException;
import dev.ashetm.wallet.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ashetm.wallet.entities.Client;
import dev.ashetm.wallet.exceptions.NotFoundException;
import dev.ashetm.wallet.repositories.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientRepository clientRepository;

	@Override
	public Client getClient(int idClient) throws ClientNotFoundException {
		return clientRepository.findById(idClient)
				.orElseThrow(() -> new ClientNotFoundException());
	}

	@Override
	public List<Client> getAllClient() {
		return clientRepository.findAll();
	}
	
	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

}
