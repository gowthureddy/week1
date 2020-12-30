package com.model;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empNo;
	private String firstName;
	private String email;

	public Employee() {
		super();
	}

	public Employee(int empNo, String firstName, String email) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.email = email;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
