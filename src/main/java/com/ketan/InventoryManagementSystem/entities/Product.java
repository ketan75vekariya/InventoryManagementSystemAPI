package com.ketan.InventoryManagementSystem.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Product {

	@Id
	@SequenceGenerator(
			name= "product_sequence",
			sequenceName = "product_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			generator = "product_sequence",
			strategy = GenerationType.SEQUENCE
			)
	@Column(
			updatable = false
			)
	private Long Id;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String productName;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String productDescription;
	
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String barcode;
	
	private Integer quantity;
	
	private Float purchasePrice;
	
	private Float salePrice;
	
	@Column(
			columnDefinition = "TEXT"
			)
	private String productImage;
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Product() {
		super();
	}

	public Product(String productName, String productDescription, String barcode, Integer quantity, Float purchasePrice,
			Float salePrice, String productImage, Date createdAt, Date updatedAt) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.barcode = barcode;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		this.productImage = productImage;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
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
		return "Product [Id=" + Id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", barcode=" + barcode + ", quantity=" + quantity + ", purchasePrice=" + purchasePrice
				+ ", salePrice=" + salePrice + ", productImage=" + productImage + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
	
	
	
	

}
