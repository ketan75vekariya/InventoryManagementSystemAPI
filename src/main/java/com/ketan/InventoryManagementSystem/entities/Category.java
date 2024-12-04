package com.ketan.InventoryManagementSystem.entities;

import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Category {
	@Id
	@SequenceGenerator(
			name= "category_sequence",
			sequenceName = "category_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			generator = "category_sequence",
			strategy = GenerationType.SEQUENCE
			)
	@Column(
			updatable = false
			)
	private Long id;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String categoryName;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String categoryDescription;
	
	@OneToMany(mappedBy="category",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Product> products;
	
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Category() {
		super();
	}

	public Category(Long id, String categoryName, String categoryDescription, Set<Product> products, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.products = products;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", categoryDescription=" + categoryDescription
				+ ", products=" + products + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	
	
	
}
