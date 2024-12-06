package com.ketan.InventoryManagementSystem.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Role implements Serializable{

	private static final long serialVersionUID = 1168010072523366609L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String roleId;
	
	@Column(nullable = false, length = 50, unique =true)
	private String role;
	
	@Column(nullable = false, length = 150)
	private String roleDescription;
	
	@Column(nullable = false)
	private Date createdAt;
	
	@Column(nullable = false)
	private Date updatedAt;
	
	private String emailValidationToken;
	
	@Column(nullable = false)
	private Boolean emailValidationTokenStatus = false;
	
	@OneToMany(mappedBy="role",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<User> users;
	
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
