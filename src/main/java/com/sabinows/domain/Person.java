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
	@Column(name = "name", nullable = false, length = 60)
	private String name;
	
	@Size(min = 3, max = 60, message = "O sobrenome da pessoa deve ter entre {min} e {max} caracteres.")
	@Column(name = "surname", nullable = true, length = 60)
	private String surname;
	
	@Column(name = "telephone", nullable = true, length = 12)
	private String telephone;
	
	@Column(name = "cellphone", nullable = true, length = 12)
	private String cellphone;
	
	@NotBlank(message = "Informe um CPF.")
	@Column(name = "CPF", nullable = false, length = 11)
	private String cpf;
	
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}