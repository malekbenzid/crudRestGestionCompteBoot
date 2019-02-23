package com.hrsopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsopra.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
