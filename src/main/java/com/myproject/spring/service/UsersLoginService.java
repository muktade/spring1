package com.myproject.spring.service;

import java.util.List;

import com.myproject.spring.entity.UsersLogin;

public interface UsersLoginService {
	
	///mention method
	////user save method
	UsersLogin saveUsers(UsersLogin users);
	
	////get all user method
	List<UsersLogin> getAllUsers();
	
	///edit user method
	UsersLogin editUsers(Long id);
	
	////delete user method
	void deleteUser(Long id);

}
