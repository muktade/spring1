package com.myproject.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.myproject.spring.entity.UsersLogin;
import com.myproject.spring.repository.UsersLoginRepository;


@Service
public class UserServicImplement implements UsersLoginService{
	
	@Autowired
	private UsersLoginRepository usersLoginRepository;

	@Override
	public UsersLogin saveUsers(UsersLogin users) {
		// TODO Auto-generated method stub
		return usersLoginRepository.save(users);
	}

	@Override
	public List<UsersLogin> getAllUsers() {
		// TODO Auto-generated method stub
		return usersLoginRepository.findAll();
	}

	@Override
	public UsersLogin editUsers(Long id) {
		// TODO Auto-generated method stub
		UsersLogin users = new UsersLogin();
		users.setId(id);
		return usersLoginRepository.findById(users.getId()).orElse(new UsersLogin());
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		UsersLogin users = new UsersLogin();
		users.setId(id);
		usersLoginRepository.deleteById(users.getId());
		
	}

}
