package com.niit.SportsKart2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.dao.CartDao;
import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.CartItems;
@Service

public class CartServiceImp implements CartService {
	@Autowired
	private CartDao cd;
	
	@Transactional
	public void add(CartItems cart)
	{
		cd.add(cart);
		
	}
	
	
	@Transactional
	public void delete(int id) {
		 cd.delete(id);
	}
	
	
	
	@Transactional
	public void update(CartItems cart) {
		cd.update(cart);
	}


	@Transactional
	public List getAllCartitems() {
		return cd.getAllCartitems();
	}


	@Transactional
	public CartItems getProductById(int cartitemid) {
		
		return cd.getProductById(cartitemid);
	}
	
	@Transactional
	public int cartLength(int id) {
		return cd.cartLength(id);
	}

	@Transactional
	public List getbyuserid(int id) {
		return cd.getbyuserid(id);
	}
}
