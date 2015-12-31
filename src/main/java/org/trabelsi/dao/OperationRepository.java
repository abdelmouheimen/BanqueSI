package org.trabelsi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trabelsi.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
