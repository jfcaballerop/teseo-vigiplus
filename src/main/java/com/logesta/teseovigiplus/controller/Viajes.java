package com.logesta.teseovigiplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logesta.teseovigiplus.entity.Viaje;
import com.logesta.teseovigiplus.services.DriverService;
import com.logesta.teseovigiplus.services.EmpresaService;

@RestController
public class Viajes {
	
	@Autowired
	public EmpresaService empserv;
	@Autowired
	public DriverService driverserv;

	@GetMapping("viajes")
	public Viaje viajes() {
		
		Viaje viaje = new Viaje(
				"E0000AAA", 
				"E0000RRR", 
				driverserv.getDrivers("123456798W"),
				"TestOrigen", 
				"Leganes", 
				"Test Mercancia", 
				empserv.getEmpresa("594"));
		
		return viaje;
		
	}

}
