package com.JWT.practiceC.ws;

import org.springframework.stereotype.Component;

import com.JWT.practiceC.wsint.AuthServiceInt;

@Component
public class AuthService implements AuthServiceInt{

	@Override
	public String helloWorld() {
		return "holaMundo";
	}

}
