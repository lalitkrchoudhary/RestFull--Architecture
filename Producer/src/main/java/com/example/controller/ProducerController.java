package com.example.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/actor")
public class ProducerController {

    @GetMapping("/app")
	public ResponseEntity<String> displayMessage(){
		System.out.println("hello");
		LocalDateTime ldt = LocalDateTime.now();
		int hours=ldt.getHour();
		String body = null;
		if(hours>12)
			body="Good morning";
		else if(hours>16)
			body = "good evening";
		else
			body = "good night";
			
		
		
		System.out.println(body);
		return new ResponseEntity<String>(body,HttpStatus.OK);
		
	}
}
