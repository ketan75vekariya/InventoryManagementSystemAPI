package com.ketan.InventoryManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/role")
public class RoleController {

	@GetMapping
	public String getAllRole() {
		return "All role List";
	}
	
	@PostMapping
	public String addRole() {
		return "Post New role";
	}
	
	@PutMapping("/{id}")
	public String updateRole() {
		return "Update role";
	}
	
	@DeleteMapping("/{id}")
	public String deleteRole() {
		return "Delete role";
	}
	
}
