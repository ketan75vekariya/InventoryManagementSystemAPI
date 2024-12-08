package com.ketan.InventoryManagementSystem.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketan.InventoryManagementSystem.model.request.CustomerDetailsRequestModel;
import com.ketan.InventoryManagementSystem.model.response.CustomerRest;
import com.ketan.InventoryManagementSystem.service.CustomerService;
import com.ketan.InventoryManagementSystem.shared.dto.CustomerDto;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public String getAllCustome() {
		return "All Customer List";
	}
	
	@PostMapping
	public CustomerRest addCustomer(@RequestBody CustomerDetailsRequestModel customerDetails) {
		CustomerRest returnValue = new CustomerRest();
		CustomerDto customerDto = new CustomerDto();
		BeanUtils.copyProperties(customerDetails, customerDto);
		CustomerDto createCustomer = customerService.createCustomer(customerDto);
		BeanUtils.copyProperties(createCustomer, returnValue);		
		return returnValue;
	}

}
