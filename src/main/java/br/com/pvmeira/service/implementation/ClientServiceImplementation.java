package br.com.pvmeira.service.implementation;

import br.com.pvmeira.model.Client;

import br.com.pvmeira.repository.ClientRepository;
import br.com.pvmeira.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by pvciria on 23/02/2017.
 */
public class ClientServiceImplementation implements ClientService {

	private final ClientRepository clientRepository;

	@Autowired
	public ClientServiceImplementation(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public Client saveClient(Client client) {
		return this.clientRepository.save(client);
	}

	@Override
	public List<Client> listAllClients() {
		return this.clientRepository.findAll();
	}

	@Override
	public void deleteClient(Long id) {
		this.clientRepository.delete(id);
	}

	@Override
	public Client updateClient(Client client) {
		return this.clientRepository.save(client);
	}

	@Override
	public Client searchClientByName(String name) {
		return this.clientRepository.findByNameIgnoreCase(name);
	}

	@Override
	public Client searchClientByEmail(String email) {
		return this.clientRepository.findByEmailContainingIgnoreCase(email);
	}
}
