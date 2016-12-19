package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int categoryid;
	private String categoryname;
	private String categorydescription;
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
	

}
