package com.examen.CL1_Kevin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examen.CL1_Kevin.entidad.cliente;
import com.examen.CL1_Kevin.repositorio.clienteRepositorio;

@SpringBootApplication
public class Cl1KevinApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Cl1KevinApplication.class, args);
	}

	@Autowired
	private clienteRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*cliente cliente1 = new cliente("kevin", "zavaleta", "kz20@gmail.com");
		repositorio.save(cliente1);
		
		cliente cliente2 = new cliente("alexis", "cotero", "ale20@gmail.com");
		repositorio.save(cliente2);
		*/
	}

}
