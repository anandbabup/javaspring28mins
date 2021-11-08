package com.example.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuickstartApplication.class, args);
	}


	
}
