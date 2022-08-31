package com.myproject.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.spring.entity.Users;
import com.myproject.spring.service.UsersService;

@Controller
@RequestMapping("/users/")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@GetMapping("userList")
	public String getAllUsers(Model model) {
//		Users users = new Users();
		List<Users> users = usersService.getAllUsers();
		model.addAttribute("allUsers",users);		
		return "index";
	}
	
//	@GetMapping("create-user")
//	private String addUser( Model model) {
//		// TODO Auto-generated method stub
//		model.addAttribute("users", new Users());
//		return "htmlPage/create";
//	}
//
//	@PostMapping("save")
//	private String saveUser(@ModelAttribute Users users) {		
//		usersService.saveUsers(users);
//		return "redirect:userList";
//	}
	@GetMapping("create-user")
	public String addUserPage( Model model) {
		model.addAttribute("users",  new Users());
		return "htmlPage/create";
	}
	
	@PostMapping("save")
	public String addUser(@ModelAttribute Users user) {
		usersService.saveUsers(user);
		return "redirect:userList";
	}
}
