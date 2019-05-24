package com.logesta.teseovigiplus.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.logesta.teseovigiplus.configuration.EnvironmentVariables;
import com.logesta.teseovigiplus.entity.Empresa;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	@Autowired	
	public EnvironmentVariables envVar;

	public Empresa getEmpresa(String id) {
        RestTemplate restTemplate = new RestTemplate();
        Empresa emp = restTemplate.getForObject(
        		envVar.getEmpresaSVC(), 
        		Empresa.class);
		return emp;
		
	}
}
