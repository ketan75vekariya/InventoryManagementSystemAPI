package com.ketan.InventoryManagementSystem.model.response;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * This Class convert java object to json response which we want to send as a response 
 */
public class RoleRest {
	
	private String roleId;
	private String role;
	private String roleDescription;
	private String createdAt;
	private String updatedAt;
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
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
		 String strDate= formatter.format(createdAt);
		 this.createdAt = strDate;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
		 String strDate= formatter.format(updatedAt);
		this.updatedAt = strDate;
	}
	
	

}
