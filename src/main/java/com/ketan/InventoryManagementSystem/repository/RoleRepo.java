package com.ketan.InventoryManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ketan.InventoryManagementSystem.entities.Role;

public interface RoleRepo extends CrudRepository<Role, Long>{
	//this is custom query
	List<Role> findRoleByRole(String role);
	
	Role findIdByRoleId(String roleId);
	String findRoleIdById(Long id);

}
