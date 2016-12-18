package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;

	public order(int orderid) {
		super();
		this.orderid = orderid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	

}
