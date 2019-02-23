package com.hrsopra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hrsopra.metier.IClientMetier;

@SpringBootApplication
public class AJpa11Application {
	@Autowired
	 IClientMetier clientMetier;
	public static void main(String[] args) {
		SpringApplication.run(AJpa11Application.class, args);
		
		
		
	}
}
