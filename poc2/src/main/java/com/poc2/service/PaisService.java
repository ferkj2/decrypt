package com.poc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc2.model.Pais;
import com.poc2.repository.PaisRepository;

@Service
public class PaisService {

	@Autowired
	private PaisRepository paisRepository;
	
	public Pais save(Pais pais) {
		return paisRepository.save(pais);
	}

}
