package com.niit.SportsKart2.model.service;

import java.util.List;

import com.niit.SportsKart2.model.entity.Register2;

public interface Register2Service {
	public void add(Register2 register2);
	public void edit(Register2 register2);
	public void delete(int register2Id);
	public Register2 getRegister2(int register2Id);
	public List getAllRegister2();

}
