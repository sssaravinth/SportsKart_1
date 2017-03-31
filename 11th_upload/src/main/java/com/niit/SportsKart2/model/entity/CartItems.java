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
	
	private int quantity;
	@ManyToOne
	@JoinColumn(name = "productid")
	private Product productid_fk;
	
	private int totalPrice;
	@OneToOne
	@JoinColumn(name="id")
	private Register2 register2_fk;
	
	public CartItems(){
		
	}
	public CartItems(int cartItems_id, Cart cartid_fk, int quantity, Product productid_fk, int totalPrice,Register2 register2_fk) {
		super();
		this.cartItems_id = cartItems_id;
		this.cartid_fk = cartid_fk;
		this.quantity = quantity;
		this.productid_fk = productid_fk;
		this.totalPrice = totalPrice;
		this.register2_fk=register2_fk;
	}

	public Register2 getRegister2_fk() {
		return register2_fk;
	}
	public void setRegister2_fk(Register2 register2_fk) {
		this.register2_fk = register2_fk;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProductid_fk() {
		return productid_fk;
	}

	public void setProductid_fk(Product productid_fk) {
		this.productid_fk = productid_fk;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	
}
