package com.gabrieloliveira.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrieloliveira.course.entities.Order;
import com.gabrieloliveira.course.service.OrderService;



@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

	@Autowired
	private OrderService service;
	
	@GetMapping
	public List<Order> findAll(){
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Order findById(@PathVariable Long id) {
		return service.findById(id);
	}
	

}
