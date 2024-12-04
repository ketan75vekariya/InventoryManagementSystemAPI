package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/categroy")
public class CategoryController {

	@GetMapping
	public String getAllCategory() {
		return "All Category List";
	}
	
	@PostMapping
	public String addCategory() {
		return "Post New Category";
	}
	
	@PutMapping("/{id}")
	public String updateCategory() {
		return "Update Category";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCategory() {
		return "Delete category";
	}
	
}
