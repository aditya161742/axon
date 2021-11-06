package com.springboot.axon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.demoaxon")
public class AxonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AxonApplication.class, args);
	}

}
