package com.poc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc2.model.Mercado;

@Repository
public interface MercadoRepository extends JpaRepository<Mercado, Integer> {

	
	
}
