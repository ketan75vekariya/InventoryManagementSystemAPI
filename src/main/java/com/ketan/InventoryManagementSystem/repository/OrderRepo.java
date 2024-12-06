package com.ketan.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.InventoryManagementSystem.entities.Orders;

public interface OrderRepo extends JpaRepository<Orders, Long>{

}
