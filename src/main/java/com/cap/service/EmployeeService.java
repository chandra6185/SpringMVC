package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.pojo.Employee;
import com.cap.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveUser(Employee emp){
		 return employeeRepository.save(emp);
	}

	public Employee findByuserId(String userId) {
		return employeeRepository.findByUserid(userId);
	}

	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
