package com.hrsopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsopra.entities.Employe;
import com.hrsopra.entities.Operation;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
