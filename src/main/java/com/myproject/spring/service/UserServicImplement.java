package com.myproject.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.spring.entity.Users;
import com.myproject.spring.repository.UsersRepository;

@Service
public class UserServicImplement implements UsersService{
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public Users saveUsers(Users users) {
		// TODO Auto-generated method stub
		return usersRepository.save(users);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	@Override
	public Users editUsers(Long id) {
		// TODO Auto-generated method stub
		Users users = new Users();
		users.setId(id);
		return usersRepository.findById(users.getId()).orElse(new Users());
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		Users users = new Users();
		users.setId(id);
		usersRepository.deleteById(users.getId());
		
	}

}
