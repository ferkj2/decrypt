package com.poc2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc2.model.Comitente;


@Repository
public interface ComitenteRepository extends JpaRepository<Comitente,Integer> {

	
	Optional<Comitente> findByDescriptionContainingIgnoreCase(String description);
	

}
