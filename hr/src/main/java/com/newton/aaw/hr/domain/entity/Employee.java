package com.newton.aaw.hr.domain.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import com.newton.aaw.hr.api.EmployeeDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	
	private String firstName;
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	private enum gender{
		M(1), F(2)
	};
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private String position;
	
	private Float monthlySalary;
	
	private Float hourSalary;
	
	private String area;
	
	
	public Employee (EmployeeDto employeeDto) {
		this.id = employeeDto.getId();
		this.firstName = employeeDto.getFirstName();
    	this.lastName = employeeDto.getLastName();
    	this.dateOfBirth = employeeDto.getDateOfBirth();
    	this.gender = employeeDto.getGender();
    	this.startDate = employeeDto.getStartDate();
    	this.endDate = employeeDto.getEndDate();
    	this.monthlySalary = employeeDto.getMonthlySalary();
    	this.hourSalary = employeeDto.getHourSalary();
    	this.area = employeeDto.getArea();
	}
	
}
