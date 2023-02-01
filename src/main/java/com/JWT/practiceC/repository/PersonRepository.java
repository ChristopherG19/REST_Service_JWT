package com.JWT.practiceC.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JWT.practiceC.entity.Person;

@Repository("personRepository")
public interface PersonRepository extends JpaRepository<Person, Serializable>{
	public Person findByUsernameAndPassword(String username, String password);
}
