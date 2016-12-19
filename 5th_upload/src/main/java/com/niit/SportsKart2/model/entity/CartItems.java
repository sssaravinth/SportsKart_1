package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartItems;

	public CartItems(int cartItems) {
		super();
		this.cartItems = cartItems;
	}

	public int getCartItems() {
		return cartItems;
	}

	public void setCartItems(int cartItems) {
		this.cartItems = cartItems;
	}
	

}
