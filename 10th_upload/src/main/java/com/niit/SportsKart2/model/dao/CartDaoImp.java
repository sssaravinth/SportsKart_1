package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.Register2;
@Repository
public class CartDaoImp implements CartDao {
	@Autowired
	private SessionFactory session;

	@Transactional(propagation = Propagation.SUPPORTS)
	public void add(Cart cart) {
		session.getCurrentSession().save(cart);
		
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void delete(int cartId) {
		session.getCurrentSession().delete(getCart(cartId));
		
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public Cart getCart(int cartId) {
		return (Cart)session.getCurrentSession().get(Cart.class, cartId);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List getAllCart() {
		return session.getCurrentSession().createQuery("from Cart").list();
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List getbyuserid(int id) {
		String Query="from CartItems where id='"+id+"'";
		  @SuppressWarnings("unchecked")
			  List<Register2> crtitem = session.getCurrentSession().createQuery(Query).list();
			  return crtitem;	
	}
	
	

	

}
