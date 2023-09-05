package com.alura.modelo;

public class Administradores {

	private Integer id;
	private String nombre;
	private String contraseña;
	
	public Administradores(String nombre, String contraseña) {
		this.nombre= nombre;
		this.contraseña = contraseña;
		
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
	public String toString() {
		return String.format("{id:%s, nombre:%s, contraseña:%s}", 
				this.id,
				this.nombre,
				this.contraseña);			
	}
}
