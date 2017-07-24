/**
 * 
 */
package com.insticator.restapi.service;

import java.util.List;

import com.insticator.restapi.bean.Employee;

/**
 * @author Akash.Palewar
 *
 */
public interface IEmployeeService {
	
	Employee create(Employee employee);
	Employee get(Long employeeId);
	List<Employee> list();
	Employee update(Employee employee, Long employeeId);
	void delete(Long employeeId);
}
