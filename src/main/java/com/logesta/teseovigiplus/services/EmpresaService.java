package com.logesta.teseovigiplus.services;

import org.springframework.stereotype.Service;

import com.logesta.teseovigiplus.entity.Empresa;

@Service
public class EmpresaService {
	
	public Empresa getEmpresa(String id) {
		//TODO Get empresa data from another AI REST
		Empresa emp = new Empresa(
				"B123456789",
				"TestEmp", 
				"Test empresa de test", 
				"Test empresa de test s.l.", 
				"594");
		
		return emp;
		
	}

}
