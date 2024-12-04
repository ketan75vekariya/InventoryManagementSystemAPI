package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderController {

	@GetMapping
	public String getAllOrder() {
		return "All Order List";
	}
	
	@PostMapping
	public String addOrder() {
		return "Post New Order";
	}
	
	@PutMapping("/{id}")
	public String updateOrder() {
		return "Update Order";
	}
	
	@DeleteMapping("/{id}")
	public String deleteOrder() {
		return "Delete Order";
	}
	
}
