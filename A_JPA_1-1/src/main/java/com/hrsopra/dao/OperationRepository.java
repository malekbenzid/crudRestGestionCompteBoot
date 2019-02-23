package com.hrsopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsopra.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
