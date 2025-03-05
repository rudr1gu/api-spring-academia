package com.dio.academia.service;

import java.util.List;

import com.dio.academia.domain.model.Aluno;

public interface AlunoService {
    Aluno createAluno(Aluno aluno);
    List<Aluno> getAllAlunos();
    Aluno getAlunoById(Long alunoId);
    Aluno updateAluno(Long alunoId, Aluno aluno);
    void deleteAluno(Long alunoId);

}
