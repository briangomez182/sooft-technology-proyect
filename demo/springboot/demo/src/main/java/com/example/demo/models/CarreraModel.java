package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "carrera")
public class CarreraModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
	private String nombre;
	private String descripcion;
	private Integer cantidadEstudiantes;
	private Integer prioridad;
	
	public CarreraModel(Long id, String nombre, String descripcion, Integer cantidadEstudiantes, Integer prioridad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidadEstudiantes = cantidadEstudiantes;
		this.prioridad = prioridad;
	}

	public CarreraModel() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Integer getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}
	public void setCantidadEstudiantes(Integer cantidadEstudiantes) {
		this.cantidadEstudiantes = cantidadEstudiantes;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

}
