package com.newton.aaw.hr.domain.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import com.newton.aaw.hr.api.EmployeeDto;
import com.newton.aaw.hr.domain.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDateTime dateOfBirth;
	
	private Gender gender;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String position;
	
	private Float monthlySalary;
	
	private Float hourSalary;
	
	private String area;

	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;

	
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
