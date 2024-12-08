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
public class Customer implements Serializable{

	private static final long serialVersionUID = -9038425895822151240L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable =false)
	private String customerId;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String customerName;
	@Column(
			nullable = false,
			columnDefinition = "TEXT",
			unique = true
			)
	private String email;
	@Column(
			nullable = false,
			length =15,
			unique = true
			)
	private String phone;
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Orders> orders;
	
	private String emailValidationToken;
	
	@Column(nullable = false)
	private Boolean emailValidationTokenStatus = false;

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

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
	

}
