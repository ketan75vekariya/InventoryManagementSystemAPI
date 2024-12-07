package com.ketan.InventoryManagementSystem.repository;


import org.springframework.data.repository.CrudRepository;

import com.ketan.InventoryManagementSystem.entities.Discount;

public interface DiscountRepo extends CrudRepository<Discount, Long>{
}
