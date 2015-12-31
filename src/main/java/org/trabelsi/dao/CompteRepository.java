package org.trabelsi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trabelsi.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{
	
}
