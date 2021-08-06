package com.apirestcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirestcrud.models.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
