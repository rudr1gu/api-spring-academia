package com.dio.academia.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.academia.domain.model.Aluno;

public interface AlunoRepository  extends JpaRepository<Aluno, Long> {
    
}
