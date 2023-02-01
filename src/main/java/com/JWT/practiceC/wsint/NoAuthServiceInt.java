package com.JWT.practiceC.wsint;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JWT.practiceC.entity.Person;

@RestController
@RequestMapping("/api/noauth")
@CrossOrigin
public interface NoAuthServiceInt {
	
	@GetMapping("/login")
	public String getUserByUsernameAndPassword(@RequestBody Person person);
	
}
