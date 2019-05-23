package com.logesta.teseovigiplus.services;
import org.springframework.stereotype.Service;
import com.logesta.teseovigiplus.entity.Conductor;

@Service
public class DriverService {
	
	public Conductor[] getDrivers(String nif) {
		//TODO Get conductor data from another AI REST
		Conductor driver = new Conductor(
				"123456789W",
				"TestDriver", 
				"TestApell1", 
				"TestApell2");
		
		return new Conductor[]{driver};
		
	}
	public Conductor[] getDrivers(String nif1, String nif2) {
		//TODO Get conductor data from another API REST
		Conductor driver1 = new Conductor(
				"123456789W",
				"TestDriver", 
				"TestApell1", 
				"TestApell2");
		Conductor driver2 = new Conductor(
				"987654321W",
				"TestDriver1", 
				"TestApell1_2", 
				"TestApell2_2");
		
		return new Conductor[]{driver1,driver2};

	}

}
