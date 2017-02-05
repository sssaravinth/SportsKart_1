package com.niit.SportsKart2.model.dao;

import com.niit.SportsKart2.model.entity.Cart;

public interface PaymentDao {
	public void add(Cart carts);
	public void order(String username);
	public void Cartitems();

}
