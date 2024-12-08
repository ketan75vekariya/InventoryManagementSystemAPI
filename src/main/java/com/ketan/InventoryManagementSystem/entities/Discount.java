package com.ketan.InventoryManagementSystem.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Discount implements Serializable{
	
	private static final long serialVersionUID = 6527081795098587372L;
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String discountId;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String discountName;
	
	private Double discountPercentage;
	
	@OneToMany(mappedBy="discount",cascade = CascadeType.ALL, orphanRemoval = true)
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

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
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
