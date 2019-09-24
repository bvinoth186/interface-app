package com.vino.interfaceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vino.*")
public class InterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfaceApplication.class, args);
	}

}
