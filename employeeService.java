package com.springAssignment.CRUD;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class employeeService {
	@Autowired
	private employeeRepo emprepo;
	
	public String createEmployee(String name,String departments, String reporting_Manager, int age, BigInteger salary) {
		Employee emp=new Employee(name, departments, reporting_Manager, age, salary);
		emprepo.save(emp);
		return ("New emp is created with id "+emp.getId());
	}
	
    public List<Employee> listEmployee(){

        return emprepo.findAll();
    }
    
    
    public void deleteEmployee(Employee u) {
    	try {
    	emprepo.delete(u);
    	System.out.println("Success");
    	}catch(Exception e) {System.out.println("Some problem "+e);}
    }

}
