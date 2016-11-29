package com.niit.SportsKart2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleid;
	private String role;
	@OneToOne
	@JoinColumn(name = "id")
	private Register2 id_fk;
	public role(int roleid, String role, Register2 id_fk) {
		super();
		this.roleid = roleid;
		this.role = role;
		this.id_fk = id_fk;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Register2 getId_fk() {
		return id_fk;
	}
	public void setId_fk(Register2 id_fk) {
		this.id_fk = id_fk;
	}
	
	
}
