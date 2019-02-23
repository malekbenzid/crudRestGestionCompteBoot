package com.hrsopra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrsopra.metier.IOperationMetier;

@RestController
public class OperationService {
	@Autowired
	private IOperationMetier operationMetier;

	@RequestMapping(value = "/versement", method = RequestMethod.PUT)
	public boolean verser(@RequestParam String code, @RequestParam Double solde, @RequestParam Long codeEmpl) {
		return operationMetier.verser(code, solde, codeEmpl);
	}

	@RequestMapping(value = "/retrait", method = RequestMethod.PUT)
	public boolean retirer(@RequestParam String code, @RequestParam Double solde, @RequestParam Long codeEmpl) {
		return operationMetier.retirer(code, solde, codeEmpl);
	}

	@RequestMapping(value = "/virment", method = RequestMethod.PUT)
	public boolean virment(@RequestParam String code1, @RequestParam String code2, @RequestParam Double montant,
			@RequestParam Long codeEmpl) {
		return operationMetier.virment(code1, code2, montant, codeEmpl);
	}

}
