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

import com.ketan.InventoryManagementSystem.model.request.UserDetailsRequestModel;
import com.ketan.InventoryManagementSystem.model.response.UserRest;
import com.ketan.InventoryManagementSystem.service.UserService;
import com.ketan.InventoryManagementSystem.shared.dto.UserDto;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping
	public String getAllUser() {
		return "All User List";
	}
	
	@PostMapping
	public UserRest addUser(@RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto createdUser = userService.createUser(userDto);
		returnValue.setRoleId(null);
		BeanUtils.copyProperties(createdUser, returnValue);
		return returnValue;
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
