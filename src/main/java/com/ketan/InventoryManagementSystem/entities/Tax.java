package com.ketan.InventoryManagementSystem.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Tax {
	
	@Id
	@SequenceGenerator(
			name= "tax_sequence",
			sequenceName = "tax_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			generator = "tax_sequence",
			strategy = GenerationType.SEQUENCE
			)
	@Column(
			updatable = false
			)
	private Long id;
	
	private String taxName;
	
	private Integer taxPercentage;
	
	@ManyToMany(mappedBy = "tax")
    private Set<Product> product = new HashSet<>();
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Tax() {
		super();
	}

	public Tax(Long id, String taxName, Integer taxPercentage, Set<Product> product, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.taxName = taxName;
		this.taxPercentage = taxPercentage;
		this.product = product;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

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

	public Integer getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(Integer taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
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
		return "Tax [id=" + id + ", taxName=" + taxName + ", taxPercentage=" + taxPercentage + ", product=" + product
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	
}
