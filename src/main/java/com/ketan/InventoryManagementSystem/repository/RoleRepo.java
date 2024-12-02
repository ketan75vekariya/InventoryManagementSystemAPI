package com.ketan.InventoryManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.InventoryManagementSystem.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{
	//this is custom query
	List<Role> findRoleByRole(String role);

}
