package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

	@GetMapping
	public String getAllProduct() {
		return "All Product List";
	}
	
	@PostMapping
	public String addProduct() {
		return "Post New Product";
	}
	
	@PutMapping("/{id}")
	public String updateProduct() {
		return "Update Product";
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct() {
		return "Delete Product";
	}
	
}
