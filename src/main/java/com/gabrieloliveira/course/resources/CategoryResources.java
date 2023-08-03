package com.gabrieloliveira.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrieloliveira.course.entities.Category;
import com.gabrieloliveira.course.service.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	
	@Autowired
	public CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findByAll(@PathVariable Long id){
		return ResponseEntity.ok().body(service.findById(id));
	}

}
