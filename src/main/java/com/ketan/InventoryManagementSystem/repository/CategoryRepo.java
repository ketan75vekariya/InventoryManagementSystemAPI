package com.ketan.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.InventoryManagementSystem.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Long>{

}
