package com.gestionUniversidad.rest;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestionUniversidad.DAO.EstudianteDAO;
import com.gestionUniversidad.DAO.ProgramasDAO;

import com.gestionUniversidad.model.Estudiante;
import com.gestionUniversidad.model.Programas;



@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/v1/gestionUniversidad/estudiantes")
public class EstudianteRest {

	@Autowired
	private EstudianteDAO estudianteDAO;
	@Autowired
	private ProgramasDAO programasDAO;
	
	@PostMapping("/registrar")
	public Estudiante registrar(@RequestBody Estudiante estudiante) {	
		estudianteDAO.save(estudiante);	
		
		return estudiante;
	}
	@CrossOrigin(origins = "*",allowedHeaders = "*")
	@GetMapping("/lista")
	public List<Estudiante> traer(){
		return estudianteDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Integer id) {
		estudianteDAO.deleteById(id);
	return"Se elimino correctamente";
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Estudiante estudiante) {
		estudianteDAO.save(estudiante);
		
	}
	
	@GetMapping("/buscar/{nombre}")
	public List<Estudiante> getPornombre(@PathVariable("nombre") String nombre){
		return estudianteDAO.findByNombre(nombre);
	}
	
	
	
}
