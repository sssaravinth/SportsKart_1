package com.niit.SportsKart2.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int categoryid;
	private String categoryname;
	private String categorydescription;
	
	@OneToMany(mappedBy="category_fk",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Product> product;
	public Category() {

	}
	
	public Category(int categoryid, String categoryname, String categorydescription) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.categorydescription = categorydescription;
	}

	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorydescription() {
		return categorydescription;
	}
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

}
