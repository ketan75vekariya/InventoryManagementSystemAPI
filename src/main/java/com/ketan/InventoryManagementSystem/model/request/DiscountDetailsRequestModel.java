package com.ketan.InventoryManagementSystem.model.request;

public class DiscountDetailsRequestModel {
	
	private String discountName;
	
	private Double discountPercentage;
	
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public Double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	

}
