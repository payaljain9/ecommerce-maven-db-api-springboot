package org.jain.controller;

import org.jain.service.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/name/{id}")
	public String getName(@PathVariable int id)
	{
		return new UserService().getName(id);
	}
	
	@GetMapping("/password/{id}")
	public String getPassword(@PathVariable int id)
	{
		return new UserService().getPassword(id);
	}
	
	@GetMapping("/email/{id}")
	public String getEmail(@PathVariable int id)
	{
		return new UserService().getEmail(id);
	}
}
