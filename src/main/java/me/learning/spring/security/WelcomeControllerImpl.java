package me.learning.spring.security;

import org.springframework.stereotype.Controller;

@Controller("WelcomeController")
public class WelcomeControllerImpl implements WelcomeController {

	public String welcome() {
		return ("<h1>Welcome</h1>");
	}

}
