package com.gestionUniversidad.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionUniversidad.model.Estudiante;
import com.gestionUniversidad.model.Programas;

@Repository
public interface ProgramasDAO extends JpaRepository<Programas, Integer> {
	List<Programas> findByNombre(String nombre);
	
}
