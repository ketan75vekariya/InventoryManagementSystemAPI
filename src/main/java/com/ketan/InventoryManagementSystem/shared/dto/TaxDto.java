package com.ketan.InventoryManagementSystem.shared.dto;

import java.io.Serializable;
import java.util.Date;

public class TaxDto implements Serializable {

	private static final long serialVersionUID = 5955653552453614237L;
	private Long id;
	private String taxId;
	private String taxName;
	private Double taxPercentage;
	private Date createdAt;
	private Date updatedAt;
	private String emailValidationToken;
	private Boolean emailValidationTokenStatus = false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
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
