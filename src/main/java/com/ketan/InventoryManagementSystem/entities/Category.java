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
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1806642087081520331L;

	@Id
	@GeneratedValue
	private Long id;
	
	
	@Column(nullable = false)
	private String categoryId;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT",
			length = 150
			)
	private String categoryName;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT",
			length = 150
			)
	private String categoryDescription;
	
	@OneToMany(mappedBy="category",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Product> products;
	
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	

	public Set<Product> getProducts() {
		return products;
	}



	public void setProducts(Set<Product> products) {
		this.products = products;
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
