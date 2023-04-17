package com.cursojpa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cursojpa.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepositoryImplementation<Categoria, Integer>{

}
