package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.Product;

@Repository

public class ProductDaoImp implements ProductDao {
	@Autowired
	private SessionFactory session;

	@Transactional(propagation = Propagation.SUPPORTS)
	public void add(Product product) {
		session.getCurrentSession().save(product);


	}

	@Transactional(propagation = Propagation.SUPPORTS)

	public void edit(Product product) {
		session.getCurrentSession().update(product);

	}

	@Transactional(propagation = Propagation.SUPPORTS)

	public void delete(int productId) {
		session.getCurrentSession().delete(getProduct(productId));

	}

	@Transactional(propagation = Propagation.SUPPORTS)

	public Product getProduct(int productId) {
		return (Product)session.getCurrentSession().get(Product.class, productId);
	}

	@Transactional(propagation = Propagation.SUPPORTS)

	public List getAllProduct() {
		return session.getCurrentSession().createQuery("from Product").list();
	}

}
