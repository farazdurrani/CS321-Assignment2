package com.farazdurrani.submitformex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.farazdurrani.submitformex.models.User;

@Controller
public class MyController {
	@GetMapping("/addUser") // /addUser refers to the URL parameter, if a first call, Get method is performed
	public String sendForm(User user) {
		return ("addUser");
	}

	@PostMapping("/addUser")
	public String processForm(User user) {
		return ("showMessage");
	}
	
	@GetMapping("/")
	public String home(@RequestParam(required = false, value = "name") String name, Model m) {
		m.addAttribute("name", name);
		return "home.html";
	}
	
	@GetMapping("/about")
	public String about(@RequestParam(required = false, value = "name") String name, Model m) {
		m.addAttribute("name", name);
		return "about.html";
	}
}