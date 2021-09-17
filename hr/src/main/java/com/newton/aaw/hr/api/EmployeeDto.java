package com.newton.aaw.hr.api;
import java.time.LocalDateTime;

import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.domain.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	
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


    
    //construtor entidade para dpt
    
    public EmployeeDto(Employee emp) {
    	this.firstName = emp.getFirstName();
    	this.lastName = emp.getLastName();
    	this.dateOfBirth = emp.getDateOfBirth();
    	this.gender = emp.getGender();
    	this.startDate = emp.getStartDate();
    	this.endDate = emp.getEndDate();
    	this.position = emp.getPosition();
    	this.monthlySalary = emp.getMonthlySalary();
    	this.hourSalary = emp.getHourSalary();
    	this.area = emp.getArea();
    	
    }
}
