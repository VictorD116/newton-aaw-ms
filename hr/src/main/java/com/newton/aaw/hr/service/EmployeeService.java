package com.newton.aaw.hr.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.domain.repository.EmployeeRepository;
import com.newton.aaw.hr.domain.repository.UserRepository;
import com.newton.aaw.hr.exception.NotFoundException;


@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository empoyeeRepository) {
		this.employeeRepository = empoyeeRepository;
	}
	
	//C - CRUD 
	public Employee create (Employee emp) {
		emp.setCreatedAt(LocalDateTime.now());
		emp.setModifiedAt(LocalDateTime.now());
		
		employeeRepository.save(emp);
		return emp;
	}
	
	//u - CRUD 
	public Employee update(String id, Employee emp) {
		
		//recuperar para validar se existe
		Employee existing =get(id);
		
		//update
		existing.setFirstName(emp.getFirstName());
		existing.setLastName(emp.getFirstName());
		existing.setDateOfBirth(emp.getDateOfBirth());
		existing.setGender(emp.getGender());
		existing.setStartDate(emp.getStartDate());
		existing.setEndDate(emp.getEndDate());
		existing.setPosition(emp.getPosition());
		existing.setMonthlySalary(emp.getMonthlySalary());
		existing.setHourSalary(emp.getHourSalary());
		existing.setArea(emp.getArea());
		
		employeeRepository.save(existing);
		return existing;
		
		
	}
	
	// R - CRUD
	public Employee get(String id) {
		var employee = employeeRepository.findById(id);
		if (employee.isEmpty()) {
			throw new NotFoundException("Employee with ID" + id + "not found");
		}
		return employee.get();
	}
	//R - CRUD
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
	//D - CRUD 
	public void delete(String id) {
		//recuperar para validar se existe
		get(id);
		
		employeeRepository.deleteById(id);
	}
}
