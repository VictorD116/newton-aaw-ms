package com.newton.aaw.hr.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.newton.aaw.hr.api.EmployeeDto;
import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.service.EmployeeService;

import lombok.Getter;
import lombok.Setter;


@RestController
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
		
	@GetMapping("/user/{id}")
	public EmployeeDto getById(@PathVariable String id) {
		var employee = employeeService.get(id);
	}
}
