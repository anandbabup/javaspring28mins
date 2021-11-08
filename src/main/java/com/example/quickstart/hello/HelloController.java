package com.example.quickstart.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello");
	}
	
	@GetMapping("/hello-bean")
	public HelloBean helloBean() {
		return new HelloBean("Hello");
	}
	
	@GetMapping("/hello/path-variable/{name}")
	public HelloBean helloBean(@PathVariable String name) {
		return new HelloBean(String.format("Hello %s", name));
	}
}
