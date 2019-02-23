package com.hrsopra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrsopra.entities.Client;
import com.hrsopra.metier.IClientMetier;

@RestController
public class ClientService {
	@Autowired
	private IClientMetier clientMetier;
	
	
	@RequestMapping(name = "/clients", method = RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}

	@RequestMapping(name = "/clients", method = RequestMethod.POST)
	public Client save(@RequestBody Client c) {
		return clientMetier.save(c);
	}

}
