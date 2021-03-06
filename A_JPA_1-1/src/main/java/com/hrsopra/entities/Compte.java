package com.hrsopra.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPE", discriminatorType = DiscriminatorType.STRING, length = 2)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ty")
@JsonSubTypes({ @Type(name = "CC", value = CompteCourant.class), @Type(name = "CE", value = CompteEpargne.class) })
public abstract class Compte implements Serializable {
	@Id

	private String idCompte;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	private Double solde;

	@ManyToOne
	@JoinColumn(name = "CODE_Empl")
	private Employe employe;
	@JsonIgnore
	@OneToMany(mappedBy = "compte", fetch = FetchType.LAZY)
	private List<Operation> operations;
	@ManyToOne
	@JoinColumn(name = "CODE_ClI")
	private Client client;

	public Compte() {
		super();

	}

	public Compte(String idCompte, Date dateCreation, Double solde) {
		super();
		this.idCompte = idCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;

	}

	public String getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

}
