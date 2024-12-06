package com.ketan.InventoryManagementSystem.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketan.InventoryManagementSystem.model.request.RoleDetailsReqestModel;
import com.ketan.InventoryManagementSystem.model.response.RoleRest;
import com.ketan.InventoryManagementSystem.service.RoleService;
import com.ketan.InventoryManagementSystem.shared.dto.RoleDto;

@RestController
@RequestMapping("/v1/role") //http://localhost:8080/v1/role
public class RoleController {
	
	@Autowired
	RoleService roleService;

	@GetMapping
	public String getAllRole() {
		return "All role List";
	}
	
	@PostMapping
	public RoleRest addRole(@RequestBody RoleDetailsReqestModel roleDetails) {
		RoleRest returnValue = new RoleRest();
		RoleDto roleDto = new RoleDto();
		BeanUtils.copyProperties(roleDetails, roleDto);
		RoleDto createdRole = roleService.createRole(roleDto);
		BeanUtils.copyProperties(createdRole, returnValue);
		return returnValue;
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
