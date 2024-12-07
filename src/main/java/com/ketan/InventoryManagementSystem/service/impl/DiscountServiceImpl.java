package com.ketan.InventoryManagementSystem.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.InventoryManagementSystem.entities.Discount;
import com.ketan.InventoryManagementSystem.repository.DiscountRepo;
import com.ketan.InventoryManagementSystem.service.DiscountService;
import com.ketan.InventoryManagementSystem.shared.Utils;
import com.ketan.InventoryManagementSystem.shared.dto.DiscountDto;

@Service
public class DiscountServiceImpl implements DiscountService {

	@Autowired
	DiscountRepo discountRepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public DiscountDto createDiscount(DiscountDto discounts) {
		Discount discountEntity = new Discount();
		BeanUtils.copyProperties(discounts, discountEntity);
		String publicDiscountId = utils.generateUniqueId(10);
		discountEntity.setDiscountId(publicDiscountId);
		discountEntity.setCreatedAt(new Date());
		discountEntity.setUpdatedAt(new Date());
		Discount storedDiscountDetails = discountRepository.save(discountEntity);
		DiscountDto returnValue = new DiscountDto();
		BeanUtils.copyProperties(storedDiscountDetails, returnValue);
		return returnValue;
	}

}
