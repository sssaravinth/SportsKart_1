package com.niit.SportsKart2.model.dao;

import java.util.List;

import com.niit.SportsKart2.model.entity.CartItems;

public interface CartItemsDao {
	public void add(CartItems cartItems);

	public 	List getAllCartitems();

}