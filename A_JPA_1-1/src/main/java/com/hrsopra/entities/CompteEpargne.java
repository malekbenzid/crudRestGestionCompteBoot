package com.hrsopra.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte implements  Serializable {
	
	private Double taux ;
	
	
	
	
	public CompteEpargne() {
		super();
	}

	public CompteEpargne(String idCompte, Date dateCreation, Double solde, Double taux) {
		super(idCompte, dateCreation, solde);
		this.taux = taux;
	}
	

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}




}
