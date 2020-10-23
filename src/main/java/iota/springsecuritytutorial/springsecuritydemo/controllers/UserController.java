package iota.springsecuritytutorial.springsecuritydemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/user")
	private String display(){
		return "<h1>Hello User</h1>";
	}

}
