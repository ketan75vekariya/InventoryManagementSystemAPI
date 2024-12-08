package com.ketan.InventoryManagementSystem.model.response;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerRest {
	
	private String customerId;
	private String customerName;
	private String email;
	private String phone;
	private String createdAt;
	private String updatedAt;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
