package br.com.pvmeira.service;

import br.com.pvmeira.model.Book;
import br.com.pvmeira.model.Client;

import java.util.List;

/**
 * Created by pvciria on 23/02/2017.
 */
public interface ClientService {
    Client saveClient(Client client);
    List<Client> listAllClients();
    void deleteClient(Long id);
    Client updateClient(Client client);
}
