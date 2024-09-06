package com.poc2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


@Entity
public class Pais {

	public Pais() {
		
	}
	
	public Pais(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	
	@Id
	private Integer id;
	
	@NotNull
    @Pattern(regexp = "Argentina|Uruguay", message = "El valor debe ser 'Argentina' o 'Uruguay'")
	private String description;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
