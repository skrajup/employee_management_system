package com.abc.ems.ENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Authentication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authId;
	private String password;
	
	
	public Authentication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authentication(int authId, String password) {
		super();
		this.authId = authId;
		this.password = password;
	}
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
