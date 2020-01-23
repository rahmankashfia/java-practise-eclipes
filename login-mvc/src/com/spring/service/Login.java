package com.spring.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login", catalog = "onlinetutorialspoint")
public class Login implements java.io.Serializable {

	private int id;
	private String userName;
	private String password;
	private Byte isactive;

	public Login() {
	}

	public Login(int id) {
		this.id = id;
	}

	public Login(int id, String userName, String password, Byte isactive) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.isactive = isactive;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "userName", length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "isactive")
	public Byte getIsactive() {
		return this.isactive;
	}

	public void setIsactive(Byte isactive) {
		this.isactive = isactive;
	}

}
