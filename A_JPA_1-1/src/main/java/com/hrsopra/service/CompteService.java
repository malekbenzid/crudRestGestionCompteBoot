package com.hrsopra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrsopra.entities.Compte;
import com.hrsopra.metier.ICompteMetier;

@RestController
public class CompteService {
	@Autowired
	private ICompteMetier compteMetier;

	@RequestMapping(value = "/comptes", method = RequestMethod.POST)
	public Compte save(@RequestBody Compte cp) {
		return compteMetier.save(cp);
	}

	@RequestMapping(value = "/comptes/{code}", method = RequestMethod.GET)
	public Compte getComptre(@PathVariable String code) {
		return compteMetier.getComptre(code);
	}

}
