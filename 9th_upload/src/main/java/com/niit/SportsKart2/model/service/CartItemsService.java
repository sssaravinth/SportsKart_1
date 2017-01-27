package com.niit.SportsKart2.model.service;

import java.util.List;

import com.niit.SportsKart2.model.entity.CartItems;

public interface CartItemsService {
	public void add(CartItems cartItems);
	public void edit(CartItems cartItems);
	public void update(CartItems cartItems);
	public void delete(int cartItems_id);
	public CartItems getCartItems(int cartItems_id);
	
	public List getAllProduct(); 
	public 	List getAllCartitems();
	
	public CartItems getProductById(int id);
	public List getbyname(String name);
	public int cartLength();

}
