package com.poc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc2.model.Mercado;
import com.poc2.service.MercadoService;

@RestController
@RequestMapping("/api/mercado")
public class MercadoController {

	@Autowired
	private MercadoService mercadoService;
	
	@PostMapping("/create")
	public Mercado createMercado(@RequestBody Mercado mercado) {
		return mercadoService.save(mercado);
	}
	
	
}
