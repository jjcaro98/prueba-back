package com.gestionUniversidad.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estudiante {

	@Column
	private String telefono;
	

	@Id
	private Integer id;
	
	@Column
	private Integer cedula;
	
	@Column
	private String nombre;
	
	@Column
	private String email;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar registDate;
	
	@Column
	private Integer id_usuario_creacion;


	
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Calendar registDate) {
		this.registDate = registDate;
	}

	public Integer getId_usuario_creacion() {
		return id_usuario_creacion;
	}

	public void setId_usuario_creacion(Integer id_usuario_creacion) {
		this.id_usuario_creacion = id_usuario_creacion;
	}
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
    @ManyToMany(mappedBy = "estudiantes")
    private List<Programas> programas;
    
    public List<Programas> getProgramas() {
		return programas;
	}

	public void setProgramas(List<Programas> programas) {
		this.programas = programas;
	}

	public Estudiante() {
    	
    }
	
}
