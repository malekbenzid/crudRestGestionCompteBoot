package com.hrsopra.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte implements Serializable {

	private Double decouvert;
	
	
	
	
	public CompteCourant() {
		super();
	}

	public CompteCourant(String idCompte, Date dateCreation, Double solde, Double decouvert) {
		super(idCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}


	public Double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}

	
}
