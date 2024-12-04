package com.ketan.InventoryManagementSystem.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	public Product() {
		super();
	}

	
	public Product(Long id, String productName, String productDescription, String barcode, Integer quantity,
			Float purchasePrice, Float salePrice, Set<Sale> sale, Set<Tax> tax, String productImage, Date createdAt,
			Date updatedAt) {
		super();
		Id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.barcode = barcode;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		this.sale = sale;
		this.tax = tax;
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


	@Override
	public String toString() {
		return "Product [Id=" + Id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", barcode=" + barcode + ", quantity=" + quantity + ", purchasePrice=" + purchasePrice
				+ ", salePrice=" + salePrice + ", sale=" + sale + ", tax=" + tax + ", productImage=" + productImage
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	

	
	
	
	

}
