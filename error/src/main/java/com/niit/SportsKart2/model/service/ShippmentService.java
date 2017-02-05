package com.niit.SportsKart2.model.service;

import java.util.List;

import com.niit.SportsKart2.model.entity.Shippment;

public interface ShippmentService {
	public void add(Shippment shippment);
	public void edit(Shippment shippment);
	
	public void saveorupdate(Shippment shippment);
	public List getbyid(int id);


}
