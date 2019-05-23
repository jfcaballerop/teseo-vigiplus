package com.logesta.teseovigiplus.entity;

public class Conductor {
	private String nif;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	
	
	public Conductor(String nif, String nombre, String apellido1, String apellido2) {
		super();
		this.nif = nif;
		Nombre = nombre;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
	}
	@Override
	public String toString() {
		return "Conductor [nif=" + nif + ", Nombre=" + Nombre + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2
				+ "]";
	}
	public String getNif() {
		return nif;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellido1() {
		return Apellido1;
	}
	public String getApellido2() {
		return Apellido2;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	

}
