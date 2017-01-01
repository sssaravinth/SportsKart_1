package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartItems_id;
	@ManyToOne
	@JoinColumn(name = "cartid")
	@JsonIgnore
	private Cart cartid_fk;
	
	private String quantity;
	@ManyToOne
	@JoinColumn(name = "productid")
	private Product productid_fk;
	
	private String totalPrice;
	public CartItems(){
		
	}
	public CartItems(int cartItems_id, Cart cartid_fk, String quantity, Product productid_fk, String totalPrice) {
		super();
		this.cartItems_id = cartItems_id;
		this.cartid_fk = cartid_fk;
		this.quantity = quantity;
		this.productid_fk = productid_fk;
		this.totalPrice = totalPrice;
	}

	public int getCartItems_id() {
		return cartItems_id;
	}

	public void setCartItems_id(int cartItems_id) {
		this.cartItems_id = cartItems_id;
	}

	public Cart getCartid_fk() {
		return cartid_fk;
	}

	public void setCartid_fk(Cart cartid_fk) {
		this.cartid_fk = cartid_fk;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Product getProductid_fk() {
		return productid_fk;
	}

	public void setProductid_fk(Product productid_fk) {
		this.productid_fk = productid_fk;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	
}
