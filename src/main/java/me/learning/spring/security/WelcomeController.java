package me.learning.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface WelcomeController {
	
	@GetMapping("/")
	public String welcome();

}
