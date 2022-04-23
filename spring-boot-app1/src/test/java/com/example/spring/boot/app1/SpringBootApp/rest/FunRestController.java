package com.example.spring.boot.app1.SpringBootApp.rest;
import  java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
@GetMapping("/")
public String sayHellow() {
	return "Hello World|| Time On Server is:"+LocalDateTime.now();
}
}
