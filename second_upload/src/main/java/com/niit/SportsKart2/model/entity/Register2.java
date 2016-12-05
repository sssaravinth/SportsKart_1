package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Register2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotEmpty(message = "must be filled") /*for validation*/
	private String yourname;
	/*@NotEmpty(message="Enter the mail id")
	@Email*/
	/*@Id
	@Email*/
	private String emailid;
	/*@NotEmpty(message = "number must be filled")
	@Size(min = 10, max = 10)*/
	/*@NotNull(message="Enter 10 digit mobile number")*/
	private String mobilenumber;
	private String enterpassword;
	private String confirmpassword;
	private boolean enabled;

	public Register2() {

	}

	public Register2(int id, String yourname, String emailid, String mobilenumber, String enterpassword,
			String confirmpassword,boolean enabled) {
		this.id = id;
		this.yourname = yourname;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
		this.enterpassword = enterpassword;
		this.confirmpassword = confirmpassword;
		this.enabled=enabled;
	}

	public String getYourname() {
		return yourname;
	}

	public void setYourname(String yourname) {
		this.yourname = yourname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEnterpassword() {
		return enterpassword;
	}

	public void setEnterpassword(String enterpassword) {
		this.enterpassword = enterpassword;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
