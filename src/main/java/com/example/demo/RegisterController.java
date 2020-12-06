package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

	@GetMapping(value = "/login")
	public String loginPage() {

		return "login";
	}
}
