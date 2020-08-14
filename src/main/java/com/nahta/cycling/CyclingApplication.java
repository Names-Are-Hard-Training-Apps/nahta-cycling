package com.nahta.cycling;

//This looks just like the main method built from the archetype (minus some spacing), so I don't think any problems are coming from this.
// That said, IntelliJ does find errors. Why?

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CyclingApplication {

	public static void main(String[] args) {

		SpringApplication.run(CyclingApplication.class, args);
	}

	}
