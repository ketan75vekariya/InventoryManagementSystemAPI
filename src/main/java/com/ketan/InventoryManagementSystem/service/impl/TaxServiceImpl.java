package com.ketan.InventoryManagementSystem.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.InventoryManagementSystem.entities.Tax;
import com.ketan.InventoryManagementSystem.repository.TaxRepo;
import com.ketan.InventoryManagementSystem.service.TaxService;
import com.ketan.InventoryManagementSystem.shared.Utils;
import com.ketan.InventoryManagementSystem.shared.dto.TaxDto;

@Service
public class TaxServiceImpl implements TaxService {

	@Autowired
	TaxRepo taxRepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public TaxDto createTax(TaxDto tax) {
		Tax taxEntity = new Tax();
		BeanUtils.copyProperties(tax, taxEntity);
		String publicTaxId = utils.generateUniqueId(10);
		taxEntity.setTaxId(publicTaxId);
		taxEntity.setCreatedAt(new Date());
		taxEntity.setUpdatedAt(new Date());
		Tax storedTaxDetails = taxRepository.save(taxEntity);
		TaxDto returnValue = new TaxDto();
		BeanUtils.copyProperties(storedTaxDetails, returnValue);
		return returnValue;
	}

}
