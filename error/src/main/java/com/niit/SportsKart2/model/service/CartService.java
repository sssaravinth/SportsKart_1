package com.niit.SportsKart2.model.service;

import java.util.List;

import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.CartItems;

public interface CartService {
	public void add(CartItems cart);

	public void delete(int id);

	public List getAllCartitems();

	public CartItems getProductById(int id);

	public void update(CartItems cart);

	public int cartLength(int id);

	public List getbyuserid(int id);

}
