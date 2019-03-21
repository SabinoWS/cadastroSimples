package com.sabinows.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sabinows.domain.Person;
import com.sabinows.infraestructure.repositories.PersonRepositoryInterface;

@Service
public class PersonService implements PersonServiceInterface {
	
	@Autowired
	private PersonRepositoryInterface repository;

	@Transactional(readOnly = false)
	@Override
	public void save (Person person) {
		repository.save(person);		
	}

	@Transactional(readOnly = true)
	@Override
	public List<Person> findAll() {
		return repository.findAll();
	}

}
