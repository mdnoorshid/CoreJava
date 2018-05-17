package com.java.learning.CoreJava.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String empName;
	private String designation;
	private int yearOfExperience;
	public Employee(int empId, String empName, String designation, int yearOfExperience) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.yearOfExperience = yearOfExperience;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation
				+ ", yearOfExperience=" + yearOfExperience + "]";
	}
	
	
	
}
