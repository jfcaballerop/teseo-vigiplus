package com.logesta.teseovigiplus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.logesta.teseovigiplus.configuration.EnvironmentVariables;
import com.logesta.teseovigiplus.entity.Conductor;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	public EnvironmentVariables envVar;

	private RestTemplate restTemplate = new RestTemplate();


	public Conductor[] getDrivers(String nif) {
		Conductor driver = restTemplate.getForObject(envVar.getDriverSVC(), Conductor.class);

		return new Conductor[] { driver };

	}

	public Conductor[] getDrivers(String nif1, String nif2) {
		Conductor driver1 = restTemplate.getForObject(envVar.getDriverSVC(), Conductor.class);
		Conductor driver2 = restTemplate.getForObject(envVar.getDriverSVC(), Conductor.class);

		return new Conductor[] { driver1, driver2 };

	}

}
