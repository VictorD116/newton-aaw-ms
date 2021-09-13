package com.newton.aaw.hr.api;

import java.time.LocalDateTime;

import com.newton.aaw.hr.domain.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private String id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String mobile;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	//construtor entidade para dpt
	
	public UserDto(User u) {
		this.id = u.getId();
		this.name = u.getName();
		this.password = u.getPassword();
		this.email = u.getEmail();
		this.mobile= u.getMobile();
		this.createdAt = u.getCreatedAt();
		this.modifiedAt= u.getModifiedAt();
	}
}

