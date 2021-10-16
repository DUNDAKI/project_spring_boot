package com.vigjoaopaulo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


// esta dizendo que a uma tabela chamada cliente


@Data
@Entity 
@Table(name = "clientes")

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;

	
	
	  public Cliente() {
	  
	  }
	  
	  public Cliente(Long id, String nome) { super(); this.id = id; this.nome =
	  nome; }
	  
	  public Long getId() { return id; }
	  
	  public void setId(Long id) { this.id = id; }
	  
	  public String getNome() { return nome; }
	  
	  public void setNome(String nome) { this.nome = nome; }
	 
	
	
	
	
	
}
