package com.JWT.practiceC.security;

import java.io.UnsupportedEncodingException;

import com.JWT.practiceC.entity.Person;

public interface JwtGeneratorInt {
	public String generateToken(Person person) throws UnsupportedEncodingException;
}
