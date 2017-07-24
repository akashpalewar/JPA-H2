/**
 * 
 */
package com.insticator.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.insticator.restapi.bean.Employee;

/**
 * @author Akash.Palewar
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
