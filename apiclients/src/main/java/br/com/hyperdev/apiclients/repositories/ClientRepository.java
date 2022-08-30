package br.com.hyperdev.apiclients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hyperdev.apiclients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
