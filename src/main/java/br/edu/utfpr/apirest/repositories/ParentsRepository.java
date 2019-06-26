package br.edu.utfpr.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apirest.entities.Parents;

/**
 * ParentsRepository
 */
public interface ParentsRepository extends JpaRepository<Parents, Long> {

}