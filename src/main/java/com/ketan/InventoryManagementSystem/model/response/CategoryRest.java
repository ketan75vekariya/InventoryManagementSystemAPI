package com.ketan.InventoryManagementSystem.model.response;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CategoryRest {
	
	private String categoryId;
	private String categoryName;
	private String categoryDescription;
	private String createdAt;
	private String updatedAt;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
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
