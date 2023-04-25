package com.examen.CL1_Kevin.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.examen.CL1_Kevin.entidad.cliente;
import com.examen.CL1_Kevin.servicio.clienteServicio;

@Controller
public class clienteControlador {
	
	@Autowired
	private clienteServicio servicio;
	
	@GetMapping("/clientes")
	public String listarClientes(Model modelo) {
		modelo.addAttribute("clientes", servicio.listarTodosLosclientes());
		return "clientes";
	}
	
	@GetMapping("/clientes/nuevo")
	public String mostrarclientesFormularioregistroCliente(Model modelo) {
		cliente cliente= new cliente();
		modelo.addAttribute("cliente", cliente);
		return "Crear_Clientes";
	}
	
@PostMapping("/clientes")
public String guardarCliente(@ModelAttribute("cliente") cliente cliente) {
	servicio.guardarCliente(cliente);
	return "redirect:/clientes";
}
	
	
}
