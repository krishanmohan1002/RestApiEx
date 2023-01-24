package com.app.rahul.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {
	
	@PostMapping("/save")
	public ResponseEntity<String> getString(
	@RequestBody String employee	
	){
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

}
