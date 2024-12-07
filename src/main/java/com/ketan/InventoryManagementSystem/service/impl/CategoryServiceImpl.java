package com.ketan.InventoryManagementSystem.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.InventoryManagementSystem.entities.Category;
import com.ketan.InventoryManagementSystem.repository.CategoryRepo;
import com.ketan.InventoryManagementSystem.service.CategoryService;
import com.ketan.InventoryManagementSystem.shared.Utils;
import com.ketan.InventoryManagementSystem.shared.dto.CategoryDto;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepo categoryRepository;
	
	@Autowired
	Utils utils;

	@Override
	public CategoryDto createCategory(CategoryDto category) {
		Category categoryEntity = new Category();
		BeanUtils.copyProperties(category, categoryEntity);
		String publicCategoryId = utils.generateUniqueId(10);
		categoryEntity.setCategoryId(publicCategoryId);
		categoryEntity.setCreatedAt(new Date());
		categoryEntity.setUpdatedAt(new Date());
		Category storedCategoryDetails = categoryRepository.save(categoryEntity);
		CategoryDto returnValue = new CategoryDto();
		BeanUtils.copyProperties(storedCategoryDetails, returnValue);
		return returnValue;
	}

}
