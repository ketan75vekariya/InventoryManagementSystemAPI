package com.ketan.InventoryManagementSystem.model.response;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DiscountRest {
	private String discountId;
	private String discountName;
	private Integer discountPercentage;
	private String createdAt;
	private String updatedAt;
	
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
