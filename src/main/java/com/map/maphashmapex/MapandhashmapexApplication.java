package com.map.maphashmapex;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapandhashmapexApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapandhashmapexApplication.class, args);
		System.out.println("Map And HashMap Example");
		Map<String, String> employees= new HashMap<>();

		employees.put("GowriSankar", "Wipro");
		employees.put("Chaitanya", "Infosys");
		employees.put("ManojVenu", "Capgemini");
		System.out.println(employees);
	}

}
