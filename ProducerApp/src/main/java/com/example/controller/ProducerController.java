package com.example.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/actor")
public class ProducerController {

	@GetMapping("/wish")
	public ResponseEntity<String> getMessage(){
		LocalDateTime ldt = LocalDateTime.now();
		int hours=ldt.getHour();
		String body =null;
		if(hours>12)
			System.out.println("Good morning");
		else if(hours>16)
			System.out.println("Good afternoon");
		else
			System.out.println("Good night");
			
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
		
	}
}
