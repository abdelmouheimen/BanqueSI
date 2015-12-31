package org.trabelsi.metier;

public interface OperationMetier {
	public boolean verser(String code,double solde,Long codeEmp);
	public boolean retrait(String code, double solde,Long codeEmp);
	public boolean virement(String code1,String code2, double solde,Long codeEmp);
	
}
