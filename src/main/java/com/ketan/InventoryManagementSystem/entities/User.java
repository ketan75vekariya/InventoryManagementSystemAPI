package com.ketan.InventoryManagementSystem.entities;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -7150969312888954615L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String userId;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String firstName;
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String lastName;
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
	
	@Column(nullable = false)
	private String password;
	
	@ManyToOne
    @JoinColumn(name="roleid", nullable=false)
    private Role role;
	
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	
	
}
