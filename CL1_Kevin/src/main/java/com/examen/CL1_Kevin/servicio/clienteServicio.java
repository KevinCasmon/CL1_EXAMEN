package com.examen.CL1_Kevin.servicio;

import java.util.List;

import com.examen.CL1_Kevin.entidad.cliente;

public interface clienteServicio {
	
	public List<cliente> listarTodosLosclientes();

	public cliente guardarCliente(cliente cliente);
}
