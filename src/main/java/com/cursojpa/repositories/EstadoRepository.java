package com.cursojpa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cursojpa.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepositoryImplementation<Estado, Integer>{

}
