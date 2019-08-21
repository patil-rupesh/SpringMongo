package com.springAssignment.CRUD;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {

	@Id
	String Id;
	String Name;
	String Departments;
	String Reporting_Manager;
	int Age;
	BigInteger Salary;
	public Employee( String name, String departments, String reporting_Manager, int age, BigInteger salary) {
		super();
		Name = name;
		Departments = departments;
		Reporting_Manager = reporting_Manager;
		Age = age;
		Salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartments() {
		return Departments;
	}
	public void setDepartments(String departments) {
		Departments = departments;
	}
	public String getReporting_Manager() {
		return Reporting_Manager;
	}
	public void setReporting_Manager(String reporting_Manager) {
		Reporting_Manager = reporting_Manager;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public BigInteger getSalary() {
		return Salary;
	}
	public void setSalary(BigInteger salary) {
		Salary = salary;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
}
