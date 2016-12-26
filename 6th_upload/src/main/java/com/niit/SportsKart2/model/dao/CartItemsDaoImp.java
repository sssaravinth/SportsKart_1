package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.CartItems;
@Repository
public class CartItemsDaoImp implements CartItemsDao {
	@Autowired
	private SessionFactory session;

	@Transactional(propagation = Propagation.SUPPORTS)
	public void add(CartItems cartItems) {
		session.getCurrentSession().save(cartItems);
		
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List getAllCartitems() {
		return session.getCurrentSession().createQuery("from CartItems ").list();
	}

}
