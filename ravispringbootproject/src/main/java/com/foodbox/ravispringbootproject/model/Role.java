package com.foodbox.ravispringbootproject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Role {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roleIdLong;
	private String roleNameString;
	
	//one to many role userRole
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	@JsonIgnore
	private Set<UserRole> userRoles= new HashSet<>();
	
	
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	public Long getRoleIdLong() {
		return roleIdLong;
	}
	public void setRoleIdLong(Long roleIdLong) {
		this.roleIdLong = roleIdLong;
	}
	public String getRoleNameString() {
		return roleNameString;
	}
	public void setRoleNameString(String roleNameString) {
		this.roleNameString = roleNameString;
	}
	public Role(Long roleIdLong, String roleNameString) {
		super();
		this.roleIdLong = roleIdLong;
		this.roleNameString = roleNameString;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
