package org.trabelsi.metier;

import java.util.List;

import org.trabelsi.entities.Employe;


public interface EmployeMetier {
	public Employe saveEmploye(Employe e);
	public List<Employe> listEmploye();
}
