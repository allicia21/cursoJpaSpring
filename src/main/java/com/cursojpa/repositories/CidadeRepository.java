package com.cursojpa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cursojpa.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepositoryImplementation<Cidade, Integer>{

}
