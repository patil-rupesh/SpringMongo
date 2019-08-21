package com.springAssignment.CRUD;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface employeeRepo extends MongoRepository<Employee,String>{

	
	
	
}



