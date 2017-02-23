package br.com.pvmeira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pvmeira.model.Client;
import br.com.pvmeira.service.ClientService;

/**
 * Created by pvciria on 23/02/2017.
 */
@RestController
@RequestMapping(name = "/client")
public class ClientController {

	private final ClientService clientService;

	@Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@RequestMapping(name = "/new", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Client saveClient(Client c) {
		return this.clientService.saveClient(c);
	}
}
