package com.poc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc2.exception.InvalidDataException;
import com.poc2.model.Comitente;
import com.poc2.service.ComitenteService;



@RestController
@RequestMapping("/api/comitente")
public class ComitenteController {

	@Autowired
	private ComitenteService comitenteService;
	
	@GetMapping("/list")
	public List<Comitente> findAllComitentes() {
		return comitenteService.findAllComitentes();
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Comitente> findComitenteById(@PathVariable Integer id) {
		return comitenteService.findComitenteById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<Comitente> findComitenteByName(@PathVariable String name) {
		return comitenteService.findComitenteByDescription(name)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/create")
	public Comitente createComitente(@RequestBody Comitente comitente) {
		try {
			return comitenteService.save(comitente);	
		} catch (Exception e) {
			throw new InvalidDataException("Data duplicada: " + e.getMessage());
		}
			
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Comitente> updateComitente(@PathVariable Integer id, @RequestBody Comitente comitente) {
		return comitenteService.findComitenteById(id)
			.map(existingComitente -> {
				existingComitente.setDescription(comitente.getDescription());
				comitenteService.save(existingComitente);
				return ResponseEntity.ok(existingComitente);
			})
			.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteComitente(@PathVariable Integer id) {
		
		/*Optional<Comitente> optionalComitente = comitenteService.findComitenteById(id);
		if(optionalComitente.isPresent()) {
			comitenteService.remove(optionalComitente);
			return new ResponseEntity<Void>(HttpStatus.OK);
		};
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);*/
		
		
		return comitenteService.findComitenteById(id)
				.map(existingComitente -> {
					comitenteService.remove(existingComitente);
					return new ResponseEntity<Void>(HttpStatus.OK);
				})
				.orElse(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
		
	}
	
	
	
	
	/*
		
		*/
		
	
	
	

	
	



	
	
	
	
	
	
}
