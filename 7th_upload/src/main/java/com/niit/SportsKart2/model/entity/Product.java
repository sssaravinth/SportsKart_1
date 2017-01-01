package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int productid;
	private String categoryname;
	private String productname;
	private String productquantity;
	private String productdescription;
	private String image;
	 @ManyToOne(fetch=FetchType.LAZY)
	 @JsonIgnore
	 @JoinColumn(name="categoryid")
	private Category category_fk;
	
	private String price;
	public Product(){}
	public Product(int productid, String categoryname ,String productname, String productquantity, String productdescription,String image,String price) {
		super();
		this.productid = productid;
		this.categoryname = categoryname;
		this.productname = productname;
		this.productquantity = productquantity;
		this.productdescription = productdescription;
		this.image = image;
		this.price=price;		
	}
	@Transient
    private MultipartFile file;
      
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Category getCategory_fk() {
		return category_fk;
	}
	public void setCategory_fk(Category category_fk) {
		this.category_fk = category_fk;
	}	
	
}
