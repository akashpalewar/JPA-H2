/**
 * 
 */
package com.insticator.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insticator.restapi.bean.Employee;
import com.insticator.restapi.repository.EmployeeRepository;

/**
 * @author Akash.Palewar
 *
 */
@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	EmployeeRepository emlpoyeeRepository;
	
	@Override
	public Employee create(Employee employee) {
		return emlpoyeeRepository.save(employee);
	}

	@Override
	public Employee get(Long accountId) {
		return emlpoyeeRepository.findOne(accountId);
	}

	@Override
	public Employee update(Employee employee, Long accountId) {
		return emlpoyeeRepository.save(employee);
	}

	@Override
	public void delete(Long accountId) {
		emlpoyeeRepository.delete(accountId);
	}

	@Override
	public List<Employee> list() {
		return (List<Employee>) emlpoyeeRepository.findAll();
	}
}
