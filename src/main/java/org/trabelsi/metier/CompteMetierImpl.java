package org.trabelsi.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabelsi.dao.CompteRepository;
import org.trabelsi.entities.Compte;
@Service
public class CompteMetierImpl implements CompteMetier{
	@Autowired
	private CompteRepository compteRepository;

	@Override
	public Compte saveCompte(Compte c) {
		// TODO Auto-generated method stub
		c.setDateCreation(new Date());
		return compteRepository.save(c);
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		return compteRepository.findOne(code);
	}
	

}
