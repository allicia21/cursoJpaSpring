package com.cursojpa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cursojpa.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepositoryImplementation<Produto, Integer>{

}
