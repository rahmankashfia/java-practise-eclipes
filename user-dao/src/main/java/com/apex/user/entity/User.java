package com.apex.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`usr`")
public class User {
	private int id;
	private String  firstName;
	private String	lastName;
	private String  middleName;
	public User() {
		super();
	}
	/**
	 * This is argument constructor
	 * @param id - id of person
	 * @param firstName - first name of person
	 * @param lastName - last name of person
	 * @param middleName - middle name
	 */
	public User(int id, String firstName, String lastName, String middleName) {
		super();
		this.id = id;
		//this logic take care
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="firstname")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="lastname")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="middlename")
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

}
