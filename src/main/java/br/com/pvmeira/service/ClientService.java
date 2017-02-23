package br.com.pvmeira.service;

import java.util.List;

import br.com.pvmeira.model.Client;

/**
 * Created by pvciria on 23/02/2017.
 */
public interface ClientService {
    Client saveClient(Client client);
    List<Client> listAllClients();
    void deleteClient(Long id);
    Client updateClient(Client client);
    Client searchClientByName(String name);
    Client searchClientByEmail(String email);
}
