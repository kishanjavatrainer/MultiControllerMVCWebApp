package com.infotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.User;

@Controller
public class UserController {

	@RequestMapping(value="/listUsers")
	public ModelAndView listUsers(){
		return new ModelAndView("listUsers", "listUsersMessage", "List of users returned.");
	}
	
	@RequestMapping(value="/saveUser")
	public ModelAndView saveUser(User user){
		return new ModelAndView("saveUser", "saveUserMessage", "User data is saved.");
	}
	
	@RequestMapping(value="/deleteUser")
	public ModelAndView deleteUser(User user){
		return new ModelAndView("deleteUser", "deleteUserMessage", "User data is deleted.");
	}
}
