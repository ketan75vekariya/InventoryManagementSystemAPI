package com.ketan.InventoryManagementSystem.shared.dto;

import java.io.Serializable;
import java.util.Date;

/*
 * This Class shared with all other layers like UI, Service, and Data layers It is also known as Data Transfer Object
 */
public class RoleDto implements Serializable {
	
	private static final long serialVersionUID = -8888260510833519944L;
	private Long id;
	private String roleId;
	private String role;
	private String roleDescription;
	private Date createdAt;
	private Date updatedAt;
	private String emailValidationToken;
	private Boolean emailValidationTokenStatus = false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getEmailValidationToken() {
		return emailValidationToken;
	}
	public void setEmailValidationToken(String emailValidationToken) {
		this.emailValidationToken = emailValidationToken;
	}
	public Boolean getEmailValidationTokenStatus() {
		return emailValidationTokenStatus;
	}
	public void setEmailValidationTokenStatus(Boolean emailValidationTokenStatus) {
		this.emailValidationTokenStatus = emailValidationTokenStatus;
	}
	
	
}
