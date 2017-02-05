package com.niit.SportsKart2.model.dao;

import java.util.List;

import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.CartItems;

public interface CartDao {
	public void add(CartItems cart);

	public void delete(int cartitemid);
	public void update(CartItems cart);
	
	public 	List getAllCartitems();
	public CartItems getProductById(int cartitemid);
	public int cartLength(int id);
	
	public List getbyuserid(int id);

}
