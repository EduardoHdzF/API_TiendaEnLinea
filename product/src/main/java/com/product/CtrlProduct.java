package com.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CtrlProduct {
	
	@RequestMapping("/category")
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	
	
}
