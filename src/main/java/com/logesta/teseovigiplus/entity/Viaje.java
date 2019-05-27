package com.logesta.teseovigiplus.entity;

import java.util.Arrays;

public class Viaje {
	private String matricula_truck;
	private String matricula_remolque;
	private Conductor[] conductores;
	private String Origen;
	private String Destino;
	private String Tipo_mercancia;
	private Empresa Transportista;
	

	public Viaje(String matricula_truck, String matricula_remolque, 
			Conductor[] conductores, String origen,
			String destino, String tipo_mercancia, Empresa transportista) {
		super();
		this.matricula_truck = matricula_truck;
		this.matricula_remolque = matricula_remolque;
		this.conductores = conductores;
		Origen = origen;
		Destino = destino;
		Tipo_mercancia = tipo_mercancia;
		Transportista = transportista;
	}
	public Conductor[] getConductores() {
		return conductores;
	}
	public void setConductores(Conductor[] conductores) {
		this.conductores = conductores;
	}
	/**
	 * @return the matricula_truck
	 */
	public String getMatricula_truck() {
		return matricula_truck;
	}
	/**
	 * @return the matricula_remolque
	 */
	public String getMatricula_remolque() {
		return matricula_remolque;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return Origen;
	}
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return Destino;
	}
	/**
	 * @return the tipo_mercancia
	 */
	public String getTipo_mercancia() {
		return Tipo_mercancia;
	}
	/**
	 * @return the transportista
	 */
	public Empresa getTransportista() {
		return Transportista;
	}
	
	public void setMatricula_truck(String matricula_truck) {
		this.matricula_truck = matricula_truck;
	}
	public void setMatricula_remolque(String matricula_remolque) {
		this.matricula_remolque = matricula_remolque;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	public void setTipo_mercancia(String tipo_mercancia) {
		Tipo_mercancia = tipo_mercancia;
	}
	public void setTransportista(Empresa transportista) {
		Transportista = transportista;
	}

	@Override
	public String toString() {
		return "Viaje [matricula_truck=" + matricula_truck + ", matricula_remolque=" + matricula_remolque
				+ ", conductores=" + Arrays.toString(conductores) + ", Origen=" + Origen + ", Destino=" + Destino
				+ ", Tipo_mercancia=" + Tipo_mercancia + ", Transportista=" + Transportista + "]";
	}
	

}
