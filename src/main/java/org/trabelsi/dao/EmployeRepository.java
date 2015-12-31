package org.trabelsi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trabelsi.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
