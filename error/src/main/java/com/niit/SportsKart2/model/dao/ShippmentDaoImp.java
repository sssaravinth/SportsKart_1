package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.Shippment;
@Repository
@Transactional
public class ShippmentDaoImp implements ShippmentDao {
	@Autowired
	private SessionFactory session;

	@Transactional(propagation=Propagation.SUPPORTS)
	public void add(Shippment shippment) {
		session.getCurrentSession().save(shippment);
		
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public void edit(Shippment shippment) {
		session.getCurrentSession().update(shippment);
		
	}
	@Transactional(propagation=Propagation.SUPPORTS)@Override
	public void saveorupdate(Shippment shippment) {
		session.getCurrentSession().saveOrUpdate(shippment);
		
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public List getbyid(int id) {
		String query="from Shippment where userid=:output";
		List image=session.getCurrentSession().createQuery(query).setParameter("output",id).list();
		return image;
	}

}
