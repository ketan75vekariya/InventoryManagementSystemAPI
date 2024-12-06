package com.ketan.InventoryManagementSystem.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.InventoryManagementSystem.entities.Role;
import com.ketan.InventoryManagementSystem.repository.RoleRepo;
import com.ketan.InventoryManagementSystem.service.RoleService;
import com.ketan.InventoryManagementSystem.shared.Utils;
import com.ketan.InventoryManagementSystem.shared.dto.RoleDto;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepo roleRepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public RoleDto createRole(RoleDto role) {
		Role roleEntity = new Role();
		BeanUtils.copyProperties(role, roleEntity);
		String publicRoleID = utils.generateUniqueId(10); 
		roleEntity.setRoleId(publicRoleID);
		roleEntity.setCreatedAt(new Date());
		roleEntity.setUpdatedAt(new Date());
		Role storedRoleDetails = roleRepository.save(roleEntity);
		RoleDto returnValue = new RoleDto();
		BeanUtils.copyProperties(storedRoleDetails, returnValue);
		return returnValue;
	}

}
