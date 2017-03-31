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
	private CartDao cartDao;

	@Transactional
	public void add(Cart cart) {
		cartDao.add(cart);
		
	}
	@Transactional
	public void delete(int cartId) {
		cartDao.delete(cartId);
		
	}


	@Transactional
	public Cart getCart(int cartId) {
		return cartDao.getCart(cartId);
	}

	@Transactional
	public List getAllCart() {
		return cartDao.getAllCart();
	}
	@Transactional
	public List getbyuserid(int id) {
		return cartDao.getbyuserid(id);
	}
	@Transactional
	public List<CartItems> getCartItemById(int id) {
		return cartDao.getCartItemById(id);
	}

}