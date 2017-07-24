package com.cap.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String itemId;
	private double itemTotal;
	private int quantity;
	
	@ManyToOne(fetch = FetchType.LAZY,targetEntity=Cart.class)
	@JoinColumn(name="CART_ID", referencedColumnName="CART_ID")
	private Cart cart;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemId=" + itemId + ", itemTotal="
				+ itemTotal + ", quantity=" + quantity + ", cart=" + cart + "]";
	}

}
