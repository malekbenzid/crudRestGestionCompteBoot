package com.hrsopra.metier;

import java.util.List;

import com.hrsopra.entities.Client;

public interface IClientMetier {
	
	public  List<Client> listClient() ;
	public Client save(Client c);

}
