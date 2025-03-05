package com.dio.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.academia.domain.model.Aluno;
import com.dio.academia.domain.repository.AlunoRepository;
import com.dio.academia.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno getAlunoById(Long alunoId) {
        return alunoRepository.findById(alunoId).orElse(null);
    }

    @Override
    public Aluno updateAluno(Long alunoId, Aluno aluno) {
        Aluno alunoToUpdate = getAlunoById(alunoId);
        if (alunoToUpdate == null) {
            return null;
        }
        alunoToUpdate.setNome(aluno.getNome());
        alunoToUpdate.setTelefone(aluno.getTelefone());
        return alunoRepository.save(alunoToUpdate);
    }

    @Override
    public void deleteAluno(Long alunoId) {
        alunoRepository.deleteById(alunoId);
    }

    @Override
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }
}