package com.ketan.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.InventoryManagementSystem.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
