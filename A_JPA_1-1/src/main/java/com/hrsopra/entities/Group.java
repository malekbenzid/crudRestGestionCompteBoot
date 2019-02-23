package com.hrsopra.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="GROUPES")
public class Group implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeGroup;
	private String nomGroup;
	@ManyToMany(mappedBy = "groupes")
	private Collection<Employe> employes;

	public Group() {
		super();
	}

	public Group(String nomGroup) {
		super();
		this.nomGroup = nomGroup;
	}

	public Long getCodeGroup() {
		return codeGroup;
	}

	public void setCodeGroup(Long codeGroup) {
		this.codeGroup = codeGroup;
	}

	public String getNomGroup() {
		return nomGroup;
	}

	public void setNomGroup(String nomGroup) {
		this.nomGroup = nomGroup;
	}

	public Collection<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}

}
