package com.examen.CL1_Kevin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.CL1_Kevin.entidad.cliente;
import com.examen.CL1_Kevin.repositorio.clienteRepositorio;


@Service
public class clienteServicioImple implements clienteServicio{

	
	@Autowired
	private clienteRepositorio repositorio;
	
	@Override
	public List<cliente> listarTodosLosclientes() {
		
		return repositorio.findAll();
	}

	@Override
	public cliente guardarCliente(cliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.save(cliente);
	}

}
