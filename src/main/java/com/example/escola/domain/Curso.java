package com.example.escola.domain;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private Integer duracaoSemestres;

    @ManyToOne(fetch = FetchType.LAZY)
    private Universidade universidade;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aluno> alunos = new ArrayList<>();

    public Curso() {}
    public Curso(String nome, Integer duracaoSemestres, Universidade universidade) {
        this.nome = nome; this.duracaoSemestres = duracaoSemestres; this.universidade = universidade;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Integer getDuracaoSemestres() { return duracaoSemestres; }
    public void setDuracaoSemestres(Integer duracaoSemestres) { this.duracaoSemestres = duracaoSemestres; }
    public Universidade getUniversidade() { return universidade; }
    public void setUniversidade(Universidade universidade) { this.universidade = universidade; }
    public List<Aluno> getAlunos() { return alunos; }
}
