package com.hrsopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsopra.entities.Group;
import com.hrsopra.entities.Operation;

public interface GroupeRepository extends JpaRepository<Group, Long> {

}
