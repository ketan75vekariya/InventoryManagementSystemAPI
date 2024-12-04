package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/discount")
public class DiscountController {

	@GetMapping
	public String getAllDiscount() {
		return "All Discount List";
	}
	
	@PostMapping
	public String addDiscount() {
		return "Post New Discount";
	}
	
	@PutMapping("/{id}")
	public String updateDiscount() {
		return "Update Discount";
	}
	
	@DeleteMapping("/{id}")
	public String deleteDiscount() {
		return "Delete Discount";
	}
	
}
