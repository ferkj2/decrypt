package com.poc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc2.model.Mercado;
import com.poc2.repository.MercadoRepository;

@Service
public class MercadoService {

	@Autowired
	private MercadoRepository mercadoRepository;
	
	public Mercado save(Mercado mercado) {
		return mercadoRepository.save(mercado);
	}

}
