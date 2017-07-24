/**
 * 
 */
package com.insticator.restapi.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insticator.restapi.bean.Employee;
import com.insticator.restapi.service.IEmployeeService;

/**
 * @author Akash.Palewar
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/")
	public String home (){
		return "Spring REST test!!!";
	}
	
	@GetMapping("/employees")
	public List<Employee> all (){
		return employeeService.list();
	}
	
	@PostMapping("/employee")
	public Employee create (@RequestBody Employee employee){
		return employeeService.create(employee);
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee get (@PathVariable Long employeeId){
		return employeeService.get(employeeId);
	}
	
	@PutMapping("/employee/{employeeId}")
	public Employee update (@RequestBody Employee employee, @PathVariable Long employeeId){
		return employeeService.update(employee, employeeId);
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public void delete (@PathVariable Long employeeId){
		employeeService.delete(employeeId);
	}
}
