package com.hrsopra.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsopra.dao.EmployeRepository;
import com.hrsopra.entities.Employe;

@Service
public class EmployeImpl implements IemployeMetier {
	@Autowired
	private EmployeRepository employeDao;

	@Override
	public Employe save(Employe e) {

		return employeDao.save(e);
	}

	@Override
	public List<Employe> listEmploye() {
		return employeDao.findAll();
	}

}
