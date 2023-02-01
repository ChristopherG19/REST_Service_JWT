package com.JWT.practiceC.wsint;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public interface AuthServiceInt {
	
	@GetMapping("/hola")
	public String helloWorld();
	
}
