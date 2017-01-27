package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.entity.Register2;
@Repository
@Transactional
public class Register2DaoImp implements Register2Dao {
	@Autowired
	private SessionFactory session;

	@Transactional(propagation=Propagation.SUPPORTS)

	public void add(Register2 register2) {
		session.getCurrentSession().save(register2);
		
	}

	@Transactional(propagation=Propagation.SUPPORTS)

	public void edit(Register2 register2) {
		session.getCurrentSession().update(register2);
		
	}

	@Transactional(propagation=Propagation.SUPPORTS)

	public void delete(int register2Id) {
		session.getCurrentSession().delete(getRegister2(register2Id));
		
	}

	@Transactional(propagation=Propagation.SUPPORTS)

	public Register2 getRegister2(int register2Id) {
		return (Register2)session.getCurrentSession().get(Register2.class, register2Id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)

	public List getAllRegister2() {
		return session.getCurrentSession().createQuery("from Register2").list();
	}

}
