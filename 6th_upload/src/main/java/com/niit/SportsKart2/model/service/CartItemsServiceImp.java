package com.niit.SportsKart2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.dao.CartItemsDao;
import com.niit.SportsKart2.model.entity.CartItems;
@Service

public class CartItemsServiceImp implements CartItemsService {
	@Autowired
	private CartItemsDao cartItemsDao;

	@Transactional
	public void add(CartItems cartItems) {
		cartItemsDao.add(cartItems);		
	}

	@Transactional
	public List getAllCartitems() {
		return cartItemsDao.getAllCartitems();
	}

}
