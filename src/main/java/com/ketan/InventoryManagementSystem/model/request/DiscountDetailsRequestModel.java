package com.ketan.InventoryManagementSystem.model.request;

public class DiscountDetailsRequestModel {
	
	private String discountName;
	
	private Integer discountPercentage;
	
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
	
	

}
