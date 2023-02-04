package com.JWT.practiceC.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.JWT.practiceC.entity.Person;
import com.JWT.practiceC.repository.PersonRepository;
import com.JWT.practiceC.security.JwtGeneratorImpl;
import com.JWT.practiceC.wsint.NoAuthServiceInt;


@Component
public class NoAuthService implements NoAuthServiceInt{

	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	JwtGeneratorImpl jG;
	
	@Override
	public String getUserByUsernameAndPassword(Person person){
		Person user = personRepository.findByUsernameAndPassword(person.getUsername(), person.getPassword());

		try {
			if (person.getUsername() == null || user.getPassword() == null) {
				return "Usuario o contraseña inválida";
			}
			String token = jG.generateToken(user);
			return "Token: "+ token;
			
		} catch (Exception e) {
			return "Usuario o contraseña inválida";
		}
	}
}
