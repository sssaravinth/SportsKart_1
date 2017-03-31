package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int orderid;
	@OneToOne
	@JoinColumn(name = "cartid")
	private Cart cartid_fk;
	@OneToOne
	@JoinColumn(name = "sid")
	private Shippment sid_fk;

	@OneToOne
	@JoinColumn(name = "id")
	private Register2 register2_fk;

	public Orders() {

	}

	public Orders(int orderid, Cart cartid_fk, Shippment sid_fk, Register2 register2_fk) {
		super();
		this.orderid = orderid;
		this.cartid_fk = cartid_fk;
		this.sid_fk = sid_fk;
		this.register2_fk = register2_fk;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Cart getCartid_fk() {
		return cartid_fk;
	}

	public void setCartid_fk(Cart cartid_fk) {
		this.cartid_fk = cartid_fk;
	}

	public Shippment getSid_fk() {
		return sid_fk;
	}

	public void setSid_fk(Shippment sid_fk) {
		this.sid_fk = sid_fk;
	}

	public Register2 getRegister2_fk() {
		return register2_fk;
	}

	public void setRegister2_fk(Register2 register2_fk) {
		this.register2_fk = register2_fk;
	}

}
