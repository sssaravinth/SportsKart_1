package com.niit.SportsKart2.model.dao;

import java.util.List;

import org.hibernate.Session;
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
	
	@Autowired
	private SessionFactory sessionFactory2;

	@Transactional(propagation=Propagation.SUPPORTS)

	public void add(Register2 register2) {
		session.getCurrentSession().saveOrUpdate(register2);
		
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

	/*@Transactional(propagation=Propagation.SUPPORTS)
	@SuppressWarnings("unchecked")
	public List<Register2> getRegister2ByName(String username) {
		
		return session.getCurrentSession().createQuery("from Register2").list();
	}*/
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Register2> getUserByName(String username) {
		String query="from Register2 where YOURNAME=:output";
		 List<Register2> image=session.getCurrentSession().createQuery(query).setParameter("output",username).list();
		
		 /*Session session2 =  session.getCurrentSession();
		 
		  String Query="from Register2 where yourname='"+username+"'";
		  @SuppressWarnings("unchecked")
		  List<Register2> productList = session2.createQuery(Query).list();
		 session.close();*/
		  return image;
	}

	 @Transactional(propagation=Propagation.SUPPORTS)
	 public List<Register2> getAllUser(){
	 		  Session session = sessionFactory2.openSession();
	 		  @SuppressWarnings("unchecked")
	 		  List<Register2> userList = session.createQuery("from User").list();
	 		  session.close();
	 		  return userList;
	 		  }

	


}
