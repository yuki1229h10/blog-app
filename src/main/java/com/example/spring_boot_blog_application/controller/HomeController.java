package com.example.spring_boot_blog_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring_boot_blog_application.models.Post;
import com.example.spring_boot_blog_application.services.PostService;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;

	@GetMapping("/")
	public String home(Model model) {
		List<Post> posts = postService.getAll();
		model.addAttribute("posts", posts);
		return "home";
	}
}
