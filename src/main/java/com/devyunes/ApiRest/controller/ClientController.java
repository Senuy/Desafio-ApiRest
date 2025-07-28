package com.devyunes.ApiRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devyunes.ApiRest.dto.ClientDTO;
import com.devyunes.ApiRest.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

	@Autowired
	private ClientService service;

	@GetMapping(value = "/{id}")
	public ClientDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping
	public Page<ClientDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}

	@PostMapping
	public ClientDTO insert(@RequestBody ClientDTO dto) {
		return service.insert(dto);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> update(@PathVariable Long id, @RequestBody ClientDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
