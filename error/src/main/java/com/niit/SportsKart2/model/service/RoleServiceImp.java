package com.niit.SportsKart2.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.dao.RoleDao;
import com.niit.SportsKart2.model.entity.Role;
@Service
public class RoleServiceImp implements RoleService {
	@Autowired
	RoleDao roleDao;

	@Transactional
	public void add(Role role) {
		roleDao.add(role);
		
	}

}
