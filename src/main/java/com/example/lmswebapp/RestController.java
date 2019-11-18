package com.example.lmswebapp;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String homepage() {
		return "home";
	}
}
