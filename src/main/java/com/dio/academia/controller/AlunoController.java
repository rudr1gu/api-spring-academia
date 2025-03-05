package com.dio.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.academia.domain.model.Aluno;
import com.dio.academia.service.AlunoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<Aluno>> getAllAlunos() {
        return ResponseEntity.ok(alunoService.getAllAlunos());
    }

    @GetMapping("/{alunoId}")
    public ResponseEntity<Aluno> getAlunoById(@PathVariable Long alunoId) {
        Aluno aluno = alunoService.getAlunoById(alunoId);
        return ResponseEntity.ok(aluno);
    }

    @PostMapping
    public ResponseEntity<Aluno> createAluno(@RequestBody Aluno aluno) {
        return ResponseEntity.ok(alunoService.createAluno(aluno));
    }

    @PutMapping("/{alunoId}")
    public ResponseEntity<Aluno> updateAluno(@PathVariable Long alunoId, @RequestBody Aluno aluno) {
        Aluno alunoUpdated = alunoService.updateAluno(alunoId, aluno);
        return ResponseEntity.ok(alunoUpdated);
    }

    @DeleteMapping("/{alunoId}")
    public ResponseEntity<Void> deleteAluno(@PathVariable Long alunoId) {
        alunoService.deleteAluno(alunoId);
        return ResponseEntity.noContent().build();
    }
}
