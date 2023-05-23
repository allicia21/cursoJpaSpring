package com.cursojpa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cursojpa.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepositoryImplementation<Cliente, Integer>{

}
