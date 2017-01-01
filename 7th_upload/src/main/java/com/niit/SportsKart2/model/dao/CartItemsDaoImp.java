package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.Cart;
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

	@Transactional(propagation = Propagation.SUPPORTS)
	public void delete(int cartItems_id) {
		session.getCurrentSession().delete(getCartItems(cartItems_id));
		
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public CartItems getCartItems(int cartItems_id) {
		return (CartItems)session.getCurrentSession().get(CartItems.class, cartItems_id);
	}

	

	

	

}
