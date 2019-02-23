package com.hrsopra.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codEmploye;
	private String nom;
	@ManyToOne
	@JoinColumn(name = "CODE_EMPLOY_SUP")
	private Employe employeSup;
	@ManyToMany
	@JoinTable(name = "EMP_GROUP")
	private Collection<Group> groupes;

	public Employe(String nom, Employe employeSup, Collection<Group> groupes) {
		super();
		this.nom = nom;
		this.employeSup = employeSup;
		this.groupes = groupes;
	}

	public Employe() {
		super();
	}

	public Long getCodEmploye() {
		return codEmploye;
	}

	public void setCodEmploye(Long codEmploye) {
		this.codEmploye = codEmploye;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@JsonIgnore
	public Employe getEmployeSup() {
		return employeSup;
	}

	public void setEmployeSup(Employe employeSup) {
		this.employeSup = employeSup;
	}

	public Collection<Group> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<Group> groupes) {
		this.groupes = groupes;
	}

}
