package com.ketan.InventoryManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.ketan.InventoryManagementSystem.entities.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

}
