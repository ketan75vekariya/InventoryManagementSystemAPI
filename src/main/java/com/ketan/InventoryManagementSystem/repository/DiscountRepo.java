package com.ketan.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.InventoryManagementSystem.entities.Discount;

public interface DiscountRepo extends JpaRepository<Discount, Long>{

}
