/**
 * 
 */
package com.cap.repository;

import org.springframework.data.repository.CrudRepository;

import com.cap.pojo.Employee;

/**
 * @author COLETI
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Number> {

	Employee findByUserid(String userId);

}
