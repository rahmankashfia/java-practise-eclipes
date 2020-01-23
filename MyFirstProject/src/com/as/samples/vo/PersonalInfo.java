package com.as.samples.vo;

public class PersonalInfo {
	
	private String firstName;
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param gender
	 * @param address
	 * @param city
	 * @param state
	 * @param country
	 * @param phone
	 */
	public PersonalInfo(String firstName, String middleName, String lastName, String gender, String address,
			String city, String state, String country, String phone) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
	}
	private String middleName;
	private String lastName;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String country;
	private String phone;
	
	
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PersonalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.middleName + " " + this.gender;
	}
}
