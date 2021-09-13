package com.newton.aaw.hr.domain.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.newton.aaw.hr.api.UserDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	private String id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String mobile;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	public User(UserDto userDto) {
		this.id = userDto.getId();
		this.name = userDto.getName();
		this.password = userDto.getPassword();
		this.email = userDto.getEmail();
		this.mobile= userDto.getMobile();
	}
}
