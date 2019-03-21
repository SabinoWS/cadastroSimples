package com.sabinows.web.validators;

import java.util.InputMismatchException;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sabinows.domain.Person;

public class PersonValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Person person = (Person) object;
		
		String CPF = person.getCpf();
		if(!CpfCustomRule.validator(CPF))
			errors.rejectValue("cpf", "InvalidCpf.person.cpf");
	}
}
