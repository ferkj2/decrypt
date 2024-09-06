package com.poc2.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Mercado> mercados = new HashSet<>(); 
        
		
		Mercado m1 = new Mercado();
		m1.setId(1);
		m1.setDescription("Mercado 1");
		m1.setCodigo("ABC");
		m1.setPais(new Pais(1,"Brasil"));
		
		mercados.add(m1);
		
		
		Comitente c1 = new Comitente();
		c1.setId(1);
		c1.setDescription("Comitente 1");
		c1.setMercados(mercados);
  
        // Create ObjectMapper 
        ObjectMapper mapper = new ObjectMapper(); 
  
        try { 
            // Create ObjectWriter with default pretty printer 
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter(); 
              
            // Convert HashSet to JSON 
            String jsonData = writer.writeValueAsString(c1); 
              
            // Print JSON Data 
            System.out.println(jsonData); 
        } 
        catch (JsonProcessingException e) { 
            e.printStackTrace(); 
        } 

	}

}
