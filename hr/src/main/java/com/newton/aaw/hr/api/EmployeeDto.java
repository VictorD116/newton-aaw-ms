package com.newton.aaw.hr.api;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDateTime dateOfBirth;
	
	private enum gender {
        Masculino, Feminino
    }; 
    
    private LocalDateTime startDate;
    
    private LocalDateTime endDate;
    
    private String position;
    
    private Float monthlySalary;
    
    private Float hourSalary;

    private String area;


    
    //construtor entidade para dpt
    
    public EmployeeDto(EmployeeDto empoyeeDto) {
    	this.id = empoyeeDto.getId();
    	this.firstName = empoyeeDto.getFirstName();
    	this.lastName = empoyeeDto.getLastName();
    	this.dateOfBirth = empoyeeDto.getDateOfBirth();
    	this.gender = empoyeeDto.getGender();
    	this.startDate = empoyeeDto.getStartDate();
    	this.endDate = empoyeeDto.getEndDate();
    	this.position = empoyeeDto.getPosition();
    	this.monthlySalary = empoyeeDto.getMonthlySalary();
    	this.hourSalary = empoyeeDto.getHourSalary();
    	this.area = empoyeeDto.getArea();
    	
    }
}
