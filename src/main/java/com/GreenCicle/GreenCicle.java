package com.GreenCicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenCicle {
	
	public static void main1(String[] args) {
		SpringApplication.run(GreenCicle.class, args);
	}
	

	
	public static void main(String[] args) {
		SpringApplication.run(GreenCicle.class, args);
		String pessoa = System.getProperty("user.name");
		pessoa = pessoa.toUpperCase();
		System.out.println("TRABALHA, " + pessoa + "!");
	}

}
