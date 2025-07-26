package com.devyunes.ApiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devyunes.ApiRest.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long > {

}
