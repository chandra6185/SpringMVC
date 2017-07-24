package com.cap.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CART_ID", unique = true, nullable = false)
	private int cartId;
	private double total;
	private String name;
	
	@OneToMany(targetEntity=Items.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="CART_ID", referencedColumnName="CART_ID")
	private Set<Items> items =new HashSet<Items>(0);
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", total=" + total + ", name=" + name
				+ ", items=" + items + "]";
	}

}
