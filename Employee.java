package com.springAssignment.CRUD;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {

	@Id
	String id;
	String name;
	String departments;
	String reporting_Manager;
	int age;
	BigInteger salary;
	public Employee( String name, String departments, String reporting_Manager, int age, BigInteger salary) {
		super();
		this.name = name;
		this.departments = departments;
		this.reporting_Manager = reporting_Manager;
		this.age = age;
		this.salary = salary;
	}
//	public Employee( String id, String name, String departments, String reporting_Manager, int age, BigInteger salary) {
//		super();
//		this.id=id;
//		this.name = name;
//		this.departments = departments;
//		this.reporting_Manager = reporting_Manager;
//		this.age = age;
//		this.salary = salary;
//	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public String getReporting_Manager() {
		return reporting_Manager;
	}
	public void setReporting_Manager(String reporting_Manager) {
		this.reporting_Manager = reporting_Manager;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigInteger getAalary() {
		return salary;
	}
	public void setAalary(BigInteger salary) {
		this.salary = salary;
	}
	
}
