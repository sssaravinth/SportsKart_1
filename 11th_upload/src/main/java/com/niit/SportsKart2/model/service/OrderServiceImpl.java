package com.niit.SportsKart2.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.dao.OrderDao;
import com.niit.SportsKart2.model.entity.Orders;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao od;

	@Override
	public void add(Orders orders) {
		{
			od.add(orders);
		}

	}

}
