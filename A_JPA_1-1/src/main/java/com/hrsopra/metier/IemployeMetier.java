package com.hrsopra.metier;

import java.util.List;

import com.hrsopra.dao.EmployeRepository;
import com.hrsopra.entities.Employe;

public interface IemployeMetier {
	
	public Employe save(Employe e);

	public List <Employe> listEmploye ();

}
