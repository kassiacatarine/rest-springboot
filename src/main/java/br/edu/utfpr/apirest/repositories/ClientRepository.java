package br.edu.utfpr.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apirest.entities.Client;

/**
 * ClientRepository
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

}