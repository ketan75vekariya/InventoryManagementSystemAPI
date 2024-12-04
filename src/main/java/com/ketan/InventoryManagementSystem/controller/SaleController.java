package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sale")
public class SaleController {

	@GetMapping
	public String getAllSale() {
		return "All Sale List";
	}
	
	@PostMapping
	public String addSale() {
		return "Post New Sale";
	}
	
	@PutMapping("/{id}")
	public String updateSale() {
		return "Update Sale";
	}
	
	@DeleteMapping("/{id}")
	public String deleteSale() {
		return "Delete Sale";
	}
	
}
