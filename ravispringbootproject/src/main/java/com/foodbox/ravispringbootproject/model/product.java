package com.foodbox.ravispringbootproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String itemName;
	private String itemPrice;
	private String itemQuantity;
	private String itemProfile;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getItemProfile() {
		return itemProfile;
	}
	public void setItemProfile(String itemProfile) {
		this.itemProfile = itemProfile;
	}
	public product(Long id, String itemName, String itemPrice, String itemQuantity, String itemProfile) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.itemProfile = itemProfile;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQuantity="
				+ itemQuantity + ", itemProfile=" + itemProfile + "]";
	}
	
}
