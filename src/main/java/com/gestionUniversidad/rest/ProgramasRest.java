package com.gestionUniversidad.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionUniversidad.DAO.EstudianteDAO;
import com.gestionUniversidad.DAO.ProgramasDAO;
import com.gestionUniversidad.model.Estudiante;
import com.gestionUniversidad.model.Programas;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/v1/gestionUniversidad/programas")
public class ProgramasRest {

	@Autowired
	private ProgramasDAO programasDAO;
	
	@PostMapping("/registrar")
	public Programas registrar(@RequestBody Programas programas) {
		programasDAO.save(programas);
		return programas;
	}
	
	@GetMapping("/lista")
	public List<Programas> traer(){
		return programasDAO.findAll();
	}
	
	@GetMapping("/buscar/{nombre}")
	public List<Programas> getPornombre(@PathVariable("nombre") String nombre){
		return programasDAO.findByNombre(nombre);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public Boolean eliminar(@PathVariable("id") Integer id) {
		programasDAO.deleteById(id);
		return true;
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Programas programas) {
		programasDAO.save(programas);
		
	}
}
