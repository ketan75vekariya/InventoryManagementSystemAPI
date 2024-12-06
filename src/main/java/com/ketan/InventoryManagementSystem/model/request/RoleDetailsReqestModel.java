package com.ketan.InventoryManagementSystem.model.request;
/*
 *This Class for convert our requested json payload to java object
 */
public class RoleDetailsReqestModel {
	
	private String role;
	
	private String roleDescription;

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
	
	

}
