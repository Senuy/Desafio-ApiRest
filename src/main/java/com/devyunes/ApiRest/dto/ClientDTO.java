package com.devyunes.ApiRest.dto;

import java.time.LocalDate;

import com.devyunes.ApiRest.entities.Client;

public class ClientDTO {

	private Long id;
	private String name;
	private Long incomme;
	private LocalDate birthDate;
	private Integer children;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, Long incomme, LocalDate birthDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.incomme = incomme;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		incomme = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Long getIncomme() {
		return incomme;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}

}
