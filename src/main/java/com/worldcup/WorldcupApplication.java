package com.worldcup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class WorldcupApplication {
	
	@Autowired
	@Qualifier("student1")
	 

	public static void main(String[] args) {
		SpringApplication.run(WorldcupApplication.class, args);
		
		System.out.println("HEllo");
	}

}
