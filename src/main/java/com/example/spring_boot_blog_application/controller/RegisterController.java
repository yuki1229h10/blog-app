package com.example.spring_boot_blog_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String getRegisterPage() {
		return "register";
	}
}
