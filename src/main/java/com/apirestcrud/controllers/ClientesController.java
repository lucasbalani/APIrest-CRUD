package com.apirestcrud.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirestcrud.models.Clientes;
import com.apirestcrud.repository.ClientesRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClientesController {

	public ClientesRepository repository;
	
	//Metodo responsável por listar os Clientes
	@GetMapping("/Clientes")
	public List<Clientes> showClientes(){
		//[...]
		return repository.findAll();
	}
	
	//Metodo responsável por cadastrar um cliente
	@PostMapping("/Clientes")
	public Clientes addClientes(@RequestBody Clientes cliente) {
		//[...]
		return repository.save(cliente);
	}
	
	//Metodo responsável por buscar um cliente na lista pelo id
	@GetMapping("/Clientes/{id}")
	public Clientes showClientesById(@PathVariable Long id) {
		//[...]
		return repository.findById(id).get();
	}
	
	@DeleteMapping("/Clientes/{id}")
	public void removeClientes(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/Clientes/{id}")
	public String atualizaClientes(@PathVariable Long id) {
		return "Método em Construção";
	}
	
	
	
}
