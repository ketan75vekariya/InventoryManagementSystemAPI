package com.ketan.InventoryManagementSystem.model.response;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * This Class convert java object to json response which we want to send as a response 
 */
public class UserRest {
	
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	//private String roleId;
	private String createdAt;
	private String updatedAt;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
//	public String getRoleId() {
//		return roleId;
//	}
//	public void setRoleId(String roleId) {
//		this.roleId = roleId;
//	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
		String strDate= formatter.format(createdAt);
		this.createdAt = strDate;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
		String strDate= formatter.format(updatedAt);
		this.updatedAt = strDate;
	}
	
	

}
