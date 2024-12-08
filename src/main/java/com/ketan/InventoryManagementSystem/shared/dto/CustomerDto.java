package com.ketan.InventoryManagementSystem.shared.dto;

import java.io.Serializable;
import java.util.Date;

public class CustomerDto implements Serializable {

	private static final long serialVersionUID = -1066817719469258769L;
	private Long id;
	private String customerId;
	private String customerName;
	private String email;
	private String phone;
	private Date createdAt;
	private Date updatedAt;
	private String emailValidationToken;
	private Boolean emailValidationTokenStatus=false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
