package com.ketan.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.InventoryManagementSystem.entities.User;

public interface UserRepo extends JpaRepository<User,Long> {

}
