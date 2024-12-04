package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

	@GetMapping
	public String getAllUser() {
		return "All User List";
	}
	
	@PostMapping
	public String addUser() {
		return "Post New User";
	}
	
	@PutMapping("/{id}")
	public String updateUser() {
		return "Update User";
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser() {
		return "Delete User";
	}
	
}
