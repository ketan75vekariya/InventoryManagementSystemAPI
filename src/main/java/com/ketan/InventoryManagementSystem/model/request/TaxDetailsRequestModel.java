package com.ketan.InventoryManagementSystem.model.request;

public class TaxDetailsRequestModel {
	
	private String taxName;
	private Double taxPercentage;
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public Double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	

}
