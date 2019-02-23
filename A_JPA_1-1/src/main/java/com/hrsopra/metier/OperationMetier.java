package com.hrsopra.metier;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsopra.dao.CompteRepository;
import com.hrsopra.dao.EmployeRepository;
import com.hrsopra.dao.OperationRepository;
import com.hrsopra.entities.Compte;
import com.hrsopra.entities.Employe;
import com.hrsopra.entities.Operation;
import com.hrsopra.entities.Retrait;
import com.hrsopra.entities.Versement;

@Service
public class OperationMetier implements IOperationMetier {
	@Autowired
	private OperationRepository operationDao;
	@Autowired
	private EmployeRepository employeDao;
	@Autowired
	private CompteRepository compteDao;

	@Override
	@Transactional
	public boolean verser(String code, Double solde, Long codeEmpl) {
		Compte compte = compteDao.getOne(code);
		Employe employe = employeDao.getOne(codeEmpl);
		compte.setSolde(compte.getSolde() + solde);
		Operation o = new Versement();
		o.setCompte(compte);
		o.setDateOperation(new Date());
		o.setEmployet(employe);
		o.setMontant(solde);
		operationDao.save(o);

		return true;
	}

	@Override
	@Transactional
	public boolean retirer(String code, Double solde, Long codeEmpl) {

		Compte compte = compteDao.getOne(code);
		if (compte.getSolde() < solde)
			throw new RuntimeException("Solde insuffisant");

		Employe employe = employeDao.getOne(codeEmpl);
		compte.setSolde(compte.getSolde() - solde);
		Operation o = new Retrait();
		o.setCompte(compte);
		o.setDateOperation(new Date());
		o.setEmployet(employe);
		o.setMontant(solde);
		operationDao.save(o);
		return false;
	}

	@Override
	@Transactional
	public boolean virment(String code1, String code2, Double montant, Long codeEmpl) {
		retirer(code1, montant, codeEmpl);
		verser(code2, montant, codeEmpl);
		return true;
	}

}
