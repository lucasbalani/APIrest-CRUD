package com.apirestcrud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Clientes {
	
	//Este atributo será um Primary Key no Banco, ou seja, um identificador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	protected String name;
	protected String phoneNumber;
	protected String address;
	protected String email;
	
}//fim Classe Clientes
