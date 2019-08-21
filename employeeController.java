package com.springAssignment.CRUD;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class employeeController {
	@Autowired
	private employeeService employeeservice;
	

	@PostMapping("/add")
	public String createEmployee(
			
			@RequestParam("name") String name, @RequestParam("departments") String departments, 
			@RequestParam("reporting_Manager") String reporting_Manager, 
			@RequestParam("age") int age, @RequestParam("salary") BigInteger salary) {

		return employeeservice.createEmployee(name, departments, reporting_Manager, age, salary);
	}
	
	@GetMapping("/list")
    public List<?> listEmployee(){
		
        return employeeservice.listEmployee();
		
    }
	
	@PostMapping("/deleteEmployeeByName")
	public String deleteEmployeeByName(@RequestParam("name") String name){
        List<Employee> ls = employeeservice.listEmployee();
        for(Employee e : ls) {
        	if(e.getName().equals(name)) {
        		employeeservice.deleteEmployee(e);
        		return "Employee Deleted";
        		}
        }
    	return "Employee Not found";        	
    }



}
