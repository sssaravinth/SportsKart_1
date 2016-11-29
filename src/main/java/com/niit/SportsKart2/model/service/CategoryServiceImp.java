package com.niit.SportsKart2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.SportsKart2.model.dao.CategoryDao;
import com.niit.SportsKart2.model.dao.ProductDao;
import com.niit.SportsKart2.model.entity.Category;
@Service
public class CategoryServiceImp implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	@Transactional
	public void add(Category category) {
		categoryDao.add(category);
		
	}

	@Transactional
	public void edit(Category category) {
		categoryDao.edit(category);
		
	}

	@Transactional
	public void delete(int categoryId) {
		categoryDao.delete(categoryId);
		
	}

	@Transactional
	public Category getCategory(int categoryId) {
		return categoryDao.getCategory(categoryId);
	}

	@Transactional
	public List getAllCategory() {
		return categoryDao.getAllCategory();
	}

}
