package com.niit.SportsKart2.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.dao.ShippmentDao;
import com.niit.SportsKart2.model.entity.Shippment;
@Service
public class ShippmentServiceImp implements ShippmentService {
	@Autowired
	ShippmentDao shippmentDao;
	

	@Transactional
	public void add(Shippment shippment) {
		shippmentDao.add(shippment);
		
	}

	@Transactional
	public void edit(Shippment shippment) {
		shippmentDao.edit(shippment);
		
	}

}
