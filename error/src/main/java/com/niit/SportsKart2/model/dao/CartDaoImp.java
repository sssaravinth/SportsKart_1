package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.CartItems;
import com.niit.SportsKart2.model.entity.Register2;
@Repository
public class CartDaoImp implements CartDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(CartItems cart) {
		
		session.getCurrentSession().save(cart);
	}
	@Override
	public void delete(int cartitemid) {
		session.getCurrentSession().delete(getProductById(cartitemid));
		
	}
	@Override
	public void update(CartItems cart) {
		session.getCurrentSession().update(cart);
	}


	
	@Override
	public List getAllCartitems() {
		
		return session.getCurrentSession().createQuery("from Cartitems ").list();

	}

	@Override
	public CartItems getProductById(int cartitemid) {
		
		return (CartItems)session.getCurrentSession().get(CartItems.class, cartitemid);
	}

	
	@Override
	public int cartLength(int id) {
		  String Query="from Cartitems where userid='"+id+"'";
		  @SuppressWarnings("unchecked")
			  List<Register2> cartitems = session.getCurrentSession().createQuery(Query).list();

		
	
		return cartitems.size();
	}
	
	@Override
	public List getbyuserid(int id) {
		  String Query="from Cartitems where userid='"+id+"'";
		  @SuppressWarnings("unchecked")
			  List<Register2> crtitem = session.getCurrentSession().createQuery(Query).list();
			  return crtitem;		
		
			}
}
