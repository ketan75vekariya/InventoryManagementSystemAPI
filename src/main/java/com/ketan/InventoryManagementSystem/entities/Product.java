package com.ketan.InventoryManagementSystem.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = -2352277357506004910L;

	@Id
	@GeneratedValue
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
	
	@ManyToOne
    @JoinColumn(name="categoryid", nullable=false)
    private Category category;
	
	@ManyToOne
    @JoinColumn(name="discountid", nullable=false)
    private Discount discount;
	
	@OneToMany(mappedBy="product",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Sale> sale;
	
	
	
	 @ManyToMany
	    @JoinTable(
	            name = "tax",
	            joinColumns = @JoinColumn(name = "productid"),
	            inverseJoinColumns = @JoinColumn(name = "taxid")
	    )
	    private Set<Tax> tax = new HashSet<>();
	
	@Column(
			columnDefinition = "TEXT"
			)
	private String productImage;
	
	

	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;


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
	
	public Set<Sale> getSale() {
		return sale;
	}

	public void setSale(Set<Sale> sale) {
		this.sale = sale;
	}

	public Set<Tax> getTax() {
		return tax;
	}

	public void setTax(Set<Tax> tax) {
		this.tax = tax;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	
	
	
	

}
