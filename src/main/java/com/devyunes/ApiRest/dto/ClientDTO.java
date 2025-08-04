package com.devyunes.ApiRest.dto;

import java.time.LocalDate;

import com.devyunes.ApiRest.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {

	private Long id;
	@Size(min =3, max = 80, message = "Nome precisar ter de 3 a 80 caracteres")
	@NotBlank(message = "Campo Requerido")
	private String name;
	
	@Size(min = 11, max = 11, message = "CPF precisa ter 11 caracteres")
	@NotBlank(message = "Campo Requerido")
	private String cpf;
	
	@NotNull(message = "Campo Requerido")
	@Positive(message = "O preço deve ser positivo")
	private Long income;
	
	private LocalDate birthDate;
	private Integer children;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String cpf, Long income, LocalDate birthDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Long getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}

}
