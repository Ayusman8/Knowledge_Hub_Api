package com.knowledge_hub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledge_hub.entity.Categories;
import com.knowledge_hub.service.impl.CategoriesServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/categories")
public class CategoriesController {
	
	@Autowired
	CategoriesServiceImpl service;
	
	@PostMapping("/create-category")
	public ResponseEntity<String> createCategory(@RequestBody Categories category){
		try {
			service.createCategory(category);
            return ResponseEntity.ok("Data saved successfully");
		}catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving data: " + e.getMessage());
		}
	}
}
