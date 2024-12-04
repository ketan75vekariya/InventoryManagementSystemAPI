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
public class Role {
	
	@Id
	@SequenceGenerator(
			name= "role_sequence",
			sequenceName = "role_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			generator = "role_sequence",
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
	private String role;
	@Column(
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String roleDesrciption;
	
	@OneToMany(mappedBy="role",cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<User> users;
	
	
	@CreationTimestamp
	private Date createdAt;
	@UpdateTimestamp
	private Date updatedAt;
	
	
	
	public Role() {
		super();
	}
	
	public Role(String role, String roleDesrciption, Set<User> users, Date createdAt, Date updatedAt) {
		super();
		this.role = role;
		this.roleDesrciption = roleDesrciption;
		this.users = users;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRoleDesrciption() {
		return roleDesrciption;
	}
	public void setRoleDesrciption(String roleDesrciption) {
		this.roleDesrciption = roleDesrciption;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
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
		return "Role [id=" + id + ", role=" + role + ", roleDesrciption=" + roleDesrciption + ", users=" + users
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	

	
}
