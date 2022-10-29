package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OpenDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext runp = SpringApplication.run(OpenDemoDriver.class, args);
		runp.start();
		System.out.println("Programme main");
	}

}
