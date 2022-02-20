package com.challenge.topic_2_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Topic2SpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(Topic2SpringApplication.class, args);

		Printer nr = new PrinterBNnC();

		System.out.println(nr.print());


	}

}
