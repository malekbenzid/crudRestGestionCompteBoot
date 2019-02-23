package com.hrsopra.metier;

public interface IOperationMetier {

	public boolean verser(String code, Double solde, Long codeEmpl);

	public boolean retirer(String code, Double solde, Long codeEmpl);

	public boolean virment(String code1, String code2, Double montant, Long codeEmpl);

}
