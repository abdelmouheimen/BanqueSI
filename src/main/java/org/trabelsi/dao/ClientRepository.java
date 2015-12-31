package org.trabelsi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trabelsi.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
