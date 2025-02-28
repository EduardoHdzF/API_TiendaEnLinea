package com.product.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.product.api.*;
import com.product.api.entity.Category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CtrlProduct {
	
	@GetMapping
	 public List<Category> getCategories() {
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category(1,"Relojes","rlj"));
		categories.add(new Category(2,"Carros","crr"));
		categories.add(new Category(3,"Celulares","cls"));
		
		return categories;
	}
	
	
	
}
