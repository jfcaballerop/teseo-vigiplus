package com.logesta.teseovigiplus.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.logesta.teseovigiplus.entity.Empresa;

@Service
public class EmpresaService {
	
	public Empresa getEmpresa(String id) {
        RestTemplate restTemplate = new RestTemplate();
        Empresa emp = restTemplate.getForObject(
        		"http://www.mocky.io/v2/5ce6a42d3300000e00731777", 
        		Empresa.class);
		return emp;
		
	}

}
