package com.gestionUniversidad.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Programas {
	@Id
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_creacion;	

	
	@JoinTable(
	        name = "rel_pro_estud",
	        joinColumns = @JoinColumn(name = "FK_PRO", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="FK_ESTU", nullable = false)
	    )
	    @ManyToMany(cascade = CascadeType.ALL)
	    private List<Estudiante> estudiantes;
	

	   public void addEstudiante(Estudiante estudiante){
	        if(this.estudiantes == null){
	            this.estudiantes = new ArrayList<>();
	        }
	        
	        this.estudiantes.add(estudiante);
	    }
	
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiante) {
		this.estudiantes = estudiante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Calendar getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Calendar fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	
	
}
