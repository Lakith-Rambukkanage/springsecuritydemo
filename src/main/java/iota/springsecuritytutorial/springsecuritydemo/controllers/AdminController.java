package iota.springsecuritytutorial.springsecuritydemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@RequestMapping("/admin")
	private String display(){
		return "<h1>Hello Admin</h1>";
	}

}
