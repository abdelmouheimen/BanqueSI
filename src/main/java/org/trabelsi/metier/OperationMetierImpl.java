package org.trabelsi.metier;

import java.util.Date;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.trabelsi.dao.CompteRepository;
import org.trabelsi.dao.EmployeRepository;
import org.trabelsi.dao.OperationRepository;
import org.trabelsi.entities.Compte;
import org.trabelsi.entities.Employe;
import org.trabelsi.entities.Operation;
import org.trabelsi.entities.Retrait;
import org.trabelsi.entities.Versement;

@Service
public class OperationMetierImpl implements OperationMetier{

	@Autowired
	private OperationRepository operationRepositor;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	@Transactional
	public boolean verser(String code, double solde, Long codeEmp) {
		Compte c=compteRepository.findOne(code);
		Employe e=employeRepository.findOne(codeEmp);
		Operation o=new Versement();
		o.setDateOperation(new Date());
		o.setMontant(solde);
		o.setCompte(c);
		o.setEmploye(e);
		c.setSolde(c.getSolde()+solde);
		return true;
	}

	@Override
	@Transactional
	public boolean retrait(String code, double solde, Long codeEmp) {
		Compte c=compteRepository.findOne(code);
		if(c.getSolde()<solde)throw new RuntimeException("solde insuffisant");
		Employe e=employeRepository.findOne(codeEmp);
		Operation o=new Retrait();
		o.setDateOperation(new Date());
		o.setMontant(solde);
		o.setCompte(c);
		o.setEmploye(e);
		c.setSolde(c.getSolde()-solde);
		return true;
	}

	@Override
	@Transactional
	public boolean virement(String code1, String code2, double solde,Long codeEmp) {
		retrait(code1, solde, codeEmp);
		verser(code2, solde, codeEmp);
		return true;
	}

}
