package com.dio.academia.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.academia.domain.model.Aluno;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Long> {
    
}
