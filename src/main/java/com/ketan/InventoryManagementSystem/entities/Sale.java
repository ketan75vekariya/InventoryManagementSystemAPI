package com.ketan.InventoryManagementSystem.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Sale {
	
	@Id
	@SequenceGenerator(
			name= "sale_sequence",
			sequenceName = "sale_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			generator = "sale_sequence",
			strategy = GenerationType.SEQUENCE
			)
	@Column(
			updatable = false
			)
	private Long id;
	
	private Integer quatity;
	
	private Double salePrice;
	
	private Double total;
	
	@ManyToOne
    @JoinColumn(name="productid", nullable=false)
    private Product product;
	
	@ManyToOne
    @JoinColumn(name="orderid", nullable=false)
    private Order order;
	
	



	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Sale() {
		super();
	}

	public Sale(Long id, Integer quatity, Double salePrice, Double total, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.quatity = quatity;
		this.salePrice = salePrice;
		this.total = total;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuatity() {
		return quatity;
	}

	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	

	public Double getTotal() {
		return total;
	}



	public void setTotal(Double total) {
		this.total = total;
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
		return "Sale [id=" + id + ", quatity=" + quatity + ", salePrice=" + salePrice + ", total=" + total
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	

}
