package com.myproject.spring.service;

import java.util.List;

import com.myproject.spring.entity.Users;

public interface UsersService {
	
	///mention method
	////user save method
	Users saveUsers(Users users);
	
	////get all user method
	List<Users> getAllUsers();
	
	///edit user method
	Users editUsers(Long id);
	
	////delete user method
	void deleteUser(Long id);

}
