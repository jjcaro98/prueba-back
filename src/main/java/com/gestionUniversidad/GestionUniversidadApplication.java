package com.gestionUniversidad;

import javax.persistence.EntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gestionUniversidad.model.Estudiante;
import com.gestionUniversidad.model.Programas;

@SpringBootApplication
public class GestionUniversidadApplication {

	public static void main(String[] args) {
		//Authors		
		
		System.out.println("FIN");
		SpringApplication.run(GestionUniversidadApplication.class, args);
	}

}
