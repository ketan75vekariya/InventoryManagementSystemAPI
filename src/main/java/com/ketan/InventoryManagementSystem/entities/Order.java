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
public class Order {

	@Id
	@SequenceGenerator(
			name= "order_sequence",
			sequenceName = "order_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			generator = "order_sequence",
			strategy = GenerationType.SEQUENCE
			)
	@Column(
			updatable = false
			)
	private Long id;
	
	private Float total;
	
	@OneToMany(mappedBy="order",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Sale> sale;
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;
	
	

	public Order() {
		super();
	}

	public Order(Long id, Float total, Set<Sale> sale, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.total = total;
		this.sale = sale;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Float getTotal() {
		return total;
	}



	public void setTotal(Float total) {
		this.total = total;
	}



	public Set<Sale> getSale() {
		return sale;
	}

	public void setSale(Set<Sale> sale) {
		this.sale = sale;
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
		return "Order [id=" + id + ", total=" + total + ", sale=" + sale + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}



	
	
	
}
