package com.gestionUniversidad.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gestionUniversidad.model.*;

@Repository
public interface EstudianteDAO extends JpaRepository<Estudiante, Integer> {
	
	List<Estudiante> findByNombre(String nombre);
}
