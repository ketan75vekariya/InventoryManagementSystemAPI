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

import com.ketan.InventoryManagementSystem.model.request.CategoryDetailsReqestModel;
import com.ketan.InventoryManagementSystem.model.response.CategoryRest;
import com.ketan.InventoryManagementSystem.service.CategoryService;
import com.ketan.InventoryManagementSystem.shared.dto.CategoryDto;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@GetMapping
	public String getAllCategory() {
		return "All Category List";
	}
	
	@PostMapping
	public CategoryRest addCategory(@RequestBody CategoryDetailsReqestModel categoryDetails ) {
		CategoryRest returnValue = new CategoryRest();
		CategoryDto categoryDto = new CategoryDto();
		BeanUtils.copyProperties(categoryDetails, categoryDto);
		CategoryDto createCategory = categoryService.createCategory(categoryDto);
		BeanUtils.copyProperties(createCategory, returnValue);
		return returnValue;
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
