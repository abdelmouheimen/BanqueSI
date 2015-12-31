package org.trabelsi.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabelsi.dao.EmployeRepository;
import org.trabelsi.entities.Employe;
@Service
public class EmployeMetierImpl implements EmployeMetier{

	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	public Employe saveEmploye(Employe e) {
		// TODO Auto-generated method stub
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> listEmploye() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}
	

}
