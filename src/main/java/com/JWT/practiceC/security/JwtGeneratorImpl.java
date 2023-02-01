package com.JWT.practiceC.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.JWT.practiceC.entity.Person;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
@PropertySource("classpath:application.properties")
public class JwtGeneratorImpl implements JwtGeneratorInt{

	@Value("${jwt.secret}")
	private String secret;
	
	@Override
	public String generateToken(Person person) {
		Map<String, Object> claims = new HashMap<>();
		return Jwts.builder().setClaims(claims).setSubject(person.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + (60*1000)))
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}

}
