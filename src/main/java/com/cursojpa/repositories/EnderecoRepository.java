package com.cursojpa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cursojpa.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepositoryImplementation<Endereco, Integer>{

}
