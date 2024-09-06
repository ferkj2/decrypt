package com.poc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc2.model.Pais;
import com.poc2.service.PaisService;

@RestController
@RequestMapping("/api/pais")
public class PaisController {

	@Autowired
	private PaisService paisService;
	
	@PostMapping("/create")
	public Pais createPais(@RequestBody Pais pais) {
		try {
			return paisService.save(pais);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
	
}
