package com.greeting.springbootdemo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/services/helloworld")
public class HelloWorld {
	

	  @GetMapping("/greeting")
	 public String helloWorld() {
	    return "Hello! Hi from Spring Boot!";
	  }

}
