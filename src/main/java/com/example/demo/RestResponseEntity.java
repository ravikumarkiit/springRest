package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RestResponseEntity<T> extends ResponseEntity<T>{
	
	T value;
	HttpStatus status;
	String message;
	
	
	public RestResponseEntity(T body, HttpStatus status, String message) {
		super(body, status);
		this.value = body;
		this.status = status;
		this.message = message;
	}
	

}
