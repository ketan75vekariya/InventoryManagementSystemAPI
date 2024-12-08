package com.ketan.InventoryManagementSystem.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.InventoryManagementSystem.entities.Customer;
import com.ketan.InventoryManagementSystem.repository.CustomerRepo;
import com.ketan.InventoryManagementSystem.service.CustomerService;
import com.ketan.InventoryManagementSystem.shared.Utils;
import com.ketan.InventoryManagementSystem.shared.dto.CustomerDto;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo customerRepository;
	
	@Autowired
	Utils utils;

	@Override
	public CustomerDto createCustomer(CustomerDto customer) {
		Customer customerEntity = new Customer();
		BeanUtils.copyProperties(customer, customerEntity);
		String publicCustomerId = utils.generateUniqueId(10);
		customerEntity.setCustomerId(publicCustomerId);
		customerEntity.setCreatedAt(new Date());
		customerEntity.setUpdatedAt(new Date());
		Customer storedCustomerDetails =customerRepository.save(customerEntity);
		CustomerDto returnValue = new CustomerDto();
		BeanUtils.copyProperties(storedCustomerDetails, returnValue);
		return returnValue;
	}

}
