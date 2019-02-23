package com.hrsopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsopra.entities.Compte;

public interface CompteRepository  extends JpaRepository<Compte, String>{

}
