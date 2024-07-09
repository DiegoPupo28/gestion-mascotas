package edu.cibertec.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 60 )
	private String nombre;
	@Column(nullable = false)
	private int edad;
	@Column(nullable = false, length = 60 )
	private String sexo;
	@Column(nullable = false, length = 60 )
	private String tamano;
	@Column(nullable = false, length = 60 )
	private String raza;
	@Column(nullable = false, length = 60 )
	private String tipo;
	public Mascota() {
	}
	public Mascota(Long id, String nombre, int edad, String sexo, String tamano, String raza, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.tamano = tamano;
		this.raza = raza;
		this.tipo = tipo;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Mascotas [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", tamano=" + tamano
				+ ", raza=" + raza + ", tipo=" + tipo + "]";
	}
}
