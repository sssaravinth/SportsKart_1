package com.niit.SportsKart2.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Shippment implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int sid;
	private String name;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private String mobilenumber;
	@OneToOne
	@JoinColumn(name = "emailid")
	private Register2 emailid_fk;
	
	@OneToOne
	@JoinColumn(name="id")
	private Register2 id_fk;
	
	public Shippment(){
		
	}
	
	public Shippment(int sid, String name, String address, String city, String state, String pincode,
			String mobilenumber, Register2 emailid_fk,Register2 id_fk) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobilenumber = mobilenumber;
		this.emailid_fk = emailid_fk;
		this.id_fk=id_fk;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Register2 getEmailid_fk() {
		return emailid_fk;
	}
	public void setEmailid_fk(Register2 emailid_fk) {
		this.emailid_fk = emailid_fk;
	}

	public Register2 getId_fk() {
		return id_fk;
	}

	public void setId_fk(Register2 id_fk) {
		this.id_fk = id_fk;
	}
	
	
}
