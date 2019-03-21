package com.sabinows.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "PEOPLE")
public class Person extends AbstractEntity<Long> {

	@NotBlank(message = "Informe um nome.")
	@Size(min = 3, max = 60, message = "O nome da pessoa deve ter entre {min} e {max} caracteres.")
	
	@Column(name = "name", nullable = false, unique = true, length = 60)
	private String name;
	
	@Column(name = "surname", nullable = false, unique = true, length = 60)
	private String surname;
	
	// TODO
	/* 
	 * Telephone
	 * Cellphone
	 * CPF
	 * */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}