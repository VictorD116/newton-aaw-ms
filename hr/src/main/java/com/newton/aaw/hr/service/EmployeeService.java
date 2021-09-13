package com.newton.aaw.hr.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.domain.repository.EmployeeRepository;


@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeRepository(EmployeeRepository empoyeeRepository) {
		this.employeeRepository = empoyeeRepository;
	}
	
	//C - CRUD 
	public Employee create (Employee u) {
		u.setCreatedAt(LocalDateTime.now());
		u.setModifiedAt(LocalDateTime.now());
		
		employeeRepository.save(u);
		return u;
	}
	//u - CRUD 
	public Employee update (String id, Employee u) {
		//recuperar para validar se existe
		var existing =get(id);
		
		//update
		existing.
	}
	
}
