package org.trabelsi.metier;

import org.trabelsi.entities.Compte;

public interface CompteMetier {
	public Compte saveCompte(Compte c);
	public Compte getCompte(String code);
	
}
