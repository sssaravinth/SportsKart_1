package com.niit.SportsKart2.model.service;

import java.util.List;

import com.niit.SportsKart2.model.entity.Product;

public interface ProductService {
	public void add(Product product);
	public void edit(Product product);
	public void delete(int productId);
	public Product getProduct(int productId);
	public List getAllProduct();
	

}
