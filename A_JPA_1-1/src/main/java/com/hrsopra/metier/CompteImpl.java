package com.hrsopra.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsopra.dao.CompteRepository;
import com.hrsopra.entities.Compte;
@Service
public class CompteImpl implements ICompteMetier{
	@Autowired
	private CompteRepository compteDao ;

	@Override
	public Compte save(Compte cp) {
		cp.setDateCreation(new Date());
		return compteDao.save(cp);
	}

	@Override
	public Compte getComptre(String code) {
		
		return compteDao.getOne(code);
	}

}
