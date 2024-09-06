package com.poc2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Mercado {

	public Mercado() {
		
	}	
	
	public Mercado(Integer id, String codigo, String description, Pais pais) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.description = description;
		this.pais = pais;
	}

	@Id
	private Integer id;
	
	private String codigo;
	
	private String description;
	
	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pais")
	private Pais pais;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
	
	
}
