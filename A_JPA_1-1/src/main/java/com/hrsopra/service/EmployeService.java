package com.hrsopra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrsopra.entities.Employe;
import com.hrsopra.metier.IemployeMetier;

@RestController
public class EmployeService {
	@Autowired
	private IemployeMetier employeMetier;

	@RequestMapping(value = "/employes", method = RequestMethod.POST)
	public Employe save(@RequestBody Employe e) {
		return employeMetier.save(e);
	}

	@RequestMapping(value = "/employes", method = RequestMethod.GET)
	public List<Employe> listEmploye() {
		return employeMetier.listEmploye();
	}

}
