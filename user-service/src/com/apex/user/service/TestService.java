package com.apex.user.service;

import java.util.Date;

import com.apex.user.service.vo.Employee;

public class TestService {
	public String sayHello() {
		return "Hello World";
	}
	
	public String sayHelloWithName( String s) {
		return "Hello World " + s;
	}
	
	public int add(int i, int j) {
		return i + j;
	}
	
	public Date getServerDate(){
		return new java.util.Date();
	}
	
	public Employee getEmployee() {
		
		Employee employee = new Employee();
		employee.setId(100);
		employee.setFirstName("Kashfia");
		employee.setLastName("Rahman");
		employee.setAddress("frmont");
		employee.setSalary(1000);
		employee.setZipcode("94536");
		return employee;
		
	}
	
	

}
