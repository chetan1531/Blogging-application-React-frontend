package com.Project1.blog.services;

import java.util.List;

import com.Project1.blog.entites.User;
import com.Project1.blog.payloads.UserDto;

public interface UserService {
	UserDto registerNewUser(UserDto user);

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto userDto,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
}
