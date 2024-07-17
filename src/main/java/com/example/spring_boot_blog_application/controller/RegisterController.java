package com.example.spring_boot_blog_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring_boot_blog_application.models.Account;
import com.example.spring_boot_blog_application.services.AccountService;

@Controller
public class RegisterController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/register")
	public String getRegisterPage(Model model) {
		Account account = new Account();
		model.addAttribute("account", account);
		return "register";
	}

	@PostMapping("/register")
	public String registerNewUser(@ModelAttribute Account account) {
		accountService.save(account);

		return "redirect:/";
	}
}
