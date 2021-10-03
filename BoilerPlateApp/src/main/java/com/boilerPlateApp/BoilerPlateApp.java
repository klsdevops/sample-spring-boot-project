package com.boilerPlateApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Ankit
 *
 */

@SpringBootApplication  
@ComponentScan("com.boilerPlate")
public class BoilerPlateApp {

	public static void main(String[] args) {
		SpringApplication.run(BoilerPlateApp.class, args);

	}

}
