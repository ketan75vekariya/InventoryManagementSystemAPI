package com.ketan.InventoryManagementSystem.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Tax implements Serializable{
	
	private static final long serialVersionUID = 2944253400912883756L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String taxId;
	
	@Column(nullable = false)
	private String taxName;
	
	private Double taxPercentage;
	
	  @ManyToMany(mappedBy = "taxes")
	    private Set<Product> products;

	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;
	
	private String emailValidationToken;
	
	@Column(nullable = false)
	private Boolean emailValidationTokenStatus = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
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
	
}
