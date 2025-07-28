package com.devyunes.ApiRest.dto;

import java.time.LocalDate;

import com.devyunes.ApiRest.entities.Client;

public class ClientDTO {

	private Long id;
	private String name;
	private String cpf;
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
