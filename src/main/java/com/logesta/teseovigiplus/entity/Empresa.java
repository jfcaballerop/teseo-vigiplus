package com.logesta.teseovigiplus.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Empresa {
	private String cif;
	private String nombre;
	private String nombre_largo;
	private String razon_social;
	private String id_teseo;
	
	public Empresa() {
		
	}
	public Empresa(String cif, String nombre, String nombre_largo, String razon_social, String id_teseo) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.nombre_largo = nombre_largo;
		this.razon_social = razon_social;
		this.id_teseo = id_teseo;
	}
	public String getCif() {
		return cif;
	}
	public String getNombre() {
		return nombre;
	}
	public String getNombre_largo() {
		return nombre_largo;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public String getId_teseo() {
		return id_teseo;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNombre_largo(String nombre_largo) {
		this.nombre_largo = nombre_largo;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public void setId_teseo(String id_teseo) {
		this.id_teseo = id_teseo;
	}
	@Override
	public String toString() {
		return "Empresa [cif=" + cif + ", nombre=" + nombre + ", nombre_largo=" + nombre_largo + ", razon_social="
				+ razon_social + ", id_teseo=" + id_teseo + "]";
	}
	
	

}
