package com.niit.SportsKart2.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	private double total;
	private int quantity;
	private Date date_time;
	@OneToOne
	@JoinColumn(name = "emailid")
	@JsonIgnore
	private Register2 emailid_fk;
	@ManyToOne
	@JoinColumn(name = "productid")
	private Product product_fk;
	@OneToMany(mappedBy = "cartid_fk", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItems> cartItems;
	@OneToOne
	@JoinColumn(name="id")
	private Register2 register2_fk;
	public Cart(){
		
	}

	public Cart(int cartId, double total, int quantity, Date date_time, Register2 emailid_fk,Product product_fk,Register2 register2_fk) {
		super();
		this.cartId = cartId;
		this.total = total;
		this.quantity = quantity;
		this.date_time = date_time;
		this.emailid_fk = emailid_fk;
		this.product_fk=product_fk;
		this.register2_fk=register2_fk;
	}

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

	public Register2 getEmailid_fk() {
		return emailid_fk;
	}

	public void setEmailid_fk(Register2 emailid_fk) {
		this.emailid_fk = emailid_fk;
	}

	public Product getProduct_fk() {
		return product_fk;
	}

	public void setProduct_fk(Product product_fk) {
		this.product_fk = product_fk;
	}

	public Register2 getRegister2_fk() {
		return register2_fk;
	}

	public void setRegister2_fk(Register2 register2_fk) {
		this.register2_fk = register2_fk;
	}

	public List<CartItems> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}

	
}
