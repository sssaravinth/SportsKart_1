package com.niit.SportsKart2.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.Register2;
import com.niit.SportsKart2.model.service.ShippmentService;

@Repository
@Transactional
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	CartDao cd;
	@Autowired
	ShippmentService bas;
	@Autowired
	Register2 ud;

	@Transactional(propagation = Propagation.SUPPORTS)
	public void add(Cart carts) {

		sessionFactory.getCurrentSession().save(carts);

	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public void order(String username) {
		// TODO Auto-generated method stub

	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public void Cartitems() {
		// TODO Auto-generated method stub

	}

}
