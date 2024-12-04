package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/tax")
public class TaxController {

	@GetMapping
	public String getAllTax() {
		return "All Tax List";
	}
	
	@PostMapping
	public String addTax() {
		return "Post New Tax";
	}
	
	@PutMapping("/{id}")
	public String updateTax() {
		return "Update Tax";
	}
	
	@DeleteMapping("/{id}")
	public String deleteTax() {
		return "Delete Tax";
	}
	
}
