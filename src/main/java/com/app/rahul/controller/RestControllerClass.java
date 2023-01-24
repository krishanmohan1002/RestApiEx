package com.app.rahul.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@GetMapping("/map")
	public ResponseEntity<String> getString(){
		return new ResponseEntity<>("First App", HttpStatus.OK);
	}
}
