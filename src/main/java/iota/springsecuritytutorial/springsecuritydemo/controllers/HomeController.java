package iota.springsecuritytutorial.springsecuritydemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	private String display(){
		return "<h1>Hello World</h1>";
	}

}
