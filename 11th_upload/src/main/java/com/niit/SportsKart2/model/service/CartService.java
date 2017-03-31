package com.niit.SportsKart2.model.service;

import java.util.List;

import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.CartItems;

public interface CartService {
	public void add(Cart cart);
	public void delete(int cartId);
	public Cart getCart(int cartId);
	public List getAllCart();
	
	public List getbyuserid(int id);
	
	public List<CartItems> getCartItemById(int id);

}