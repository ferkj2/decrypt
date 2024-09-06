package com.poc2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc2.model.Comitente;
import com.poc2.repository.ComitenteRepository;


@Service
public class ComitenteService {

	@Autowired
	private ComitenteRepository comitenteRepository;
	
	public List<Comitente> findAllComitentes() {
		return comitenteRepository.findAll();
	}
	
	public Optional<Comitente> findComitenteById(Integer id) {
		return comitenteRepository.findById(id);
	}
	
	public Optional<Comitente> findComitenteByDescription(String description) {
		return comitenteRepository.findByDescriptionContainingIgnoreCase(description);
	}
	
	public Comitente save(Comitente comitente) {
		return comitenteRepository.saveAndFlush(comitente);
	}

	public void remove(Comitente comitente) {
		comitenteRepository.delete(comitente);
	}
	
	
}

