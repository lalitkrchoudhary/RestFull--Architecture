package com.example.resttemp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerController implements  CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate template = new RestTemplate();
		String serviceUrl="http://localhost:8080/RestMiniProject/api/tourist/wish";
	
		ResponseEntity<String> responseEntity= template.getForEntity(serviceUrl, String.class);
		System.out.println("Response Body "+responseEntity.getBody());
	    //System.out.println(responseEntity.getStatusCodeValue());
	    System.out.println(responseEntity.getStatusCode().getClass());
	}

	

}
