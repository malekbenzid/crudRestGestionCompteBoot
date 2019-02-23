package com.hrsopra.metier;

import com.hrsopra.entities.Compte;

public interface ICompteMetier {
	
	public Compte save(Compte cp);
	public Compte getComptre(String code);
	

}
