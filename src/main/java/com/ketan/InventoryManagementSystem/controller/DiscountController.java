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

import com.ketan.InventoryManagementSystem.model.request.DiscountDetailsRequestModel;
import com.ketan.InventoryManagementSystem.model.response.DiscountRest;
import com.ketan.InventoryManagementSystem.service.DiscountService;
import com.ketan.InventoryManagementSystem.shared.dto.DiscountDto;

@RestController
@RequestMapping("/v1/discount")
public class DiscountController {
	
	@Autowired
	DiscountService discountService;
	
	@GetMapping
	public String getAllDiscount() {
		return "All Discount List";
	}
	
	@PostMapping
	public DiscountRest addDiscount(@RequestBody DiscountDetailsRequestModel discountDetails) {
		DiscountRest returnValue = new DiscountRest();
		DiscountDto discountDto = new DiscountDto();
		BeanUtils.copyProperties(discountDetails, discountDto);
		DiscountDto createDiscount = discountService.createDiscount(discountDto);
		BeanUtils.copyProperties(createDiscount, returnValue);
		return returnValue;
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
