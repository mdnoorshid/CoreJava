package com.java.learning.CoreJava.comparable;

public class Employee implements Comparable<Employee> {
 private int id;
 private String name;
 private long phoneNumber;
 private String department;
public Employee(int id, String name, long phoneNumber, String department) {
	super();
	this.id = id;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.department = department;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public int compareTo(Employee emp2) {
	
	//this > emp2 = +
	//this < emp2 = -
	//this = emp2 = 0

	if(this.getPhoneNumber() > emp2.getPhoneNumber()){
		return 1;
	}else{
		return -1;
	}
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", department=" + department
			+ "]";
}

 
}
