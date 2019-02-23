package com.hrsopra.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsopra.dao.ClientRepository;
import com.hrsopra.entities.Client;

@Service
public class ClientImpl implements IClientMetier {
	@Autowired
	private ClientRepository clientDao;

	@Override
	public List<Client> listClient() {
		return clientDao.findAll();
	}

	@Override
	public Client save(Client c) {
		clientDao.save(c);
		return c;
	}

}
