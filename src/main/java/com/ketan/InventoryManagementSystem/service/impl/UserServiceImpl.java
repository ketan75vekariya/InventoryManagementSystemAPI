package com.ketan.InventoryManagementSystem.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.InventoryManagementSystem.entities.Role;
import com.ketan.InventoryManagementSystem.entities.User;
import com.ketan.InventoryManagementSystem.repository.RoleRepo;
import com.ketan.InventoryManagementSystem.repository.UserRepo;
import com.ketan.InventoryManagementSystem.service.UserService;
import com.ketan.InventoryManagementSystem.shared.Utils;
import com.ketan.InventoryManagementSystem.shared.dto.UserDto;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepository;
	
	@Autowired
	RoleRepo roleRepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public UserDto createUser(UserDto user) {
		User userEntity = new User();
		BeanUtils.copyProperties(user, userEntity);
		String publicUserId = utils.generateUniqueId(30);
		userEntity.setUserId(publicUserId);
		Role roleId = roleRepository.findIdByRoleId(user.getRoleId());
		userEntity.setRole(roleId);
		userEntity.setCreatedAt(new Date());
		userEntity.setUpdatedAt(new Date());
		User storedUserDetails = userRepository.save(userEntity);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		return returnValue;
	}

}
