package com.niit.SportsKart2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.dao.Register2Dao;
import com.niit.SportsKart2.model.entity.Register2;
@Service

public class Register2ServiceImp implements Register2Service {
	@Autowired
	Register2Dao register2Dao;
	@Transactional
	public void add(Register2 register2) {
		register2Dao.add(register2);
		
	}

	@Transactional
	public void edit(Register2 register2) {
		register2Dao.edit(register2);
		
	}

	@Transactional
	public void delete(int register2Id) {
		register2Dao.delete(register2Id);
		
	}

	@Transactional
	public Register2 getRegister2(int register2Id) {
		return register2Dao.getRegister2(register2Id);
	}

	@Transactional
	public List getAllRegister2() {
		return register2Dao.getAllRegister2();
	}

}
