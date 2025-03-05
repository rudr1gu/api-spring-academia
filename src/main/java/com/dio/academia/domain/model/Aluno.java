package com.dio.academia.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",nullable = false)
    private String nome;

    @Column(name = "idade",nullable = false)
    private int idade;

    @Column(name = "peso",nullable = false)
    private float peso;

    @Column(name = "altura",nullable = false)
    private float altura;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "telefone",nullable = false)
    private String telefone;

}
