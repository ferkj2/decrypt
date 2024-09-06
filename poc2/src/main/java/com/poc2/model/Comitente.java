package com.poc2.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Comitente {

	public Comitente() {
		
	}
	
	public Comitente(Integer id, String description) {
		this.id = id;
		this.description = description;
	}


	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "description")
	private String description;
	
	
	@ManyToMany
	@JoinTable(name = "comitente_mercado", 
			  joinColumns = @JoinColumn(name = "id_comitente"), 
			  inverseJoinColumns = @JoinColumn(name = "id_mercado"))
	private Set<Mercado> mercados;
	
	
	
	
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

	public Set<Mercado> getMercados() {
		return mercados;
	}

	public void setMercados(Set<Mercado> mercados) {
		this.mercados = mercados;
	}
	
	


	
	
}
