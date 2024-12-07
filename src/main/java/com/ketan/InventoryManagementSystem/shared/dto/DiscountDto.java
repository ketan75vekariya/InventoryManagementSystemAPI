package com.ketan.InventoryManagementSystem.shared.dto;

import java.io.Serializable;
import java.util.Date;

public class DiscountDto implements Serializable{

	private static final long serialVersionUID = 5033447582102826255L;
	
	private Long id;
	private String discountId;
	private String discountName;
	private Integer discountPercentage;
	private Date createdAt;
	private Date updatedAt;
	private Boolean emailValidationTokenStatus = false;
	private String emailValidationToken;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiscountId() {
		return discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public Integer getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
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
	public Boolean getEmailValidationTokenStatus() {
		return emailValidationTokenStatus;
	}
	public void setEmailValidationTokenStatus(Boolean emailValidationTokenStatus) {
		this.emailValidationTokenStatus = emailValidationTokenStatus;
	}
	public String getEmailValidationToken() {
		return emailValidationToken;
	}
	public void setEmailValidationToken(String emailValidationToken) {
		this.emailValidationToken = emailValidationToken;
	}
	
	
}
