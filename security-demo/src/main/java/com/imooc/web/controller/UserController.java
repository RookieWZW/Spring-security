package com.imooc.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.User;

import io.swagger.annotations.ApiParam;

@RestController

public class UserController {
	
	@RequestMapping(value = "/user",method = RequestMethod.GET)
	public List<User> query(){
		
		List<User> users = new ArrayList<>();
		users.add(new User());
		users.add(new User());
		users.add(new User());
		return null;
	}
	
	
	@GetMapping("/{id:\\d+}")
	@JsonView(User.UserDetailView.class)
	public User getInfo(@ApiParam("用户id")@PathVariable String id) {
		
		System.out.println("进入getInfo服務");
		
		User user = new User();
		
		user.setUsername("tom");
		
		return user;
	}
	
}
