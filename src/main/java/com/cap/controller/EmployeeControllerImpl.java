package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.pojo.Employee;
import com.cap.service.EmployeeService;

@RestController
public class EmployeeControllerImpl {

	@Autowired
	EmployeeService employeeService;
	
	@Value("${user.coleti}")
	private String username;
	
	@Autowired
	private Environment env;
	
	@RequestMapping(method = RequestMethod.POST,value = "/adduser")
	public Employee addUser(@RequestBody Employee  employee){
		return employeeService.saveUser(employee);
	}
	
	@RequestMapping("/findByuserId/{userId}")
	public Employee findByuserId(@PathVariable String userId){
		System.out.println("finding user by userId");
		return employeeService.findByuserId(userId);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/updateUser")
	public Employee updateUser(@RequestBody Employee  employee){
		System.out.println("In Update user");
		return employeeService.saveUser(employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleteUser")
	public void deleteUser(@RequestBody Employee  employee){
		System.out.println("In Delete user");
		employeeService.delete(employee);
	}
}
