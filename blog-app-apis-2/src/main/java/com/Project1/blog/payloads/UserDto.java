package com.Project1.blog.payloads;



import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    
	
	private int id;
	
	@NotEmpty
	@Size(min=4 , message="Username must be min of 4 characters !!")
	private String name;
	
	@Email(message = "Email address is not valid!!")
	@NotEmpty(message = "kindly enter valid email !!")
	private String email;
	
	@NotEmpty
	@Size(min=3 , max=10,message = "Password must be min of 3 chars and max 10 chars !!")
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles=new HashSet<>();
	
	@JsonIgnore
	public String getPassword() {
		return this.password;
	}
}
