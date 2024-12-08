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

import com.ketan.InventoryManagementSystem.model.request.TaxDetailsRequestModel;
import com.ketan.InventoryManagementSystem.model.response.TaxRest;
import com.ketan.InventoryManagementSystem.service.TaxService;
import com.ketan.InventoryManagementSystem.shared.dto.TaxDto;

@RestController
@RequestMapping("/v1/tax")
public class TaxController {

	@Autowired
	TaxService taxService;
	
	@GetMapping
	public String getAllTax() {
		return "All Tax List";
	}
	
	@PostMapping
	public TaxRest addTax(@RequestBody TaxDetailsRequestModel taxDetails ) {
		TaxRest returnValue = new TaxRest();
		TaxDto taxDto = new TaxDto();
		BeanUtils.copyProperties(taxDetails, taxDto);
		TaxDto createTax =taxService.createTax(taxDto);
		BeanUtils.copyProperties( createTax,returnValue);
		return returnValue;
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
