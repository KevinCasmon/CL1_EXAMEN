package com.examen.CL1_Kevin.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.CL1_Kevin.entidad.cliente;

@Repository
public interface clienteRepositorio extends JpaRepository<cliente, Long> {

}
