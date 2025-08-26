package com.example.escola.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
public class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Email
    private String email;
    @Column(unique = true, nullable = false)
    private String matricula;

    @ManyToOne(fetch = FetchType.LAZY)
    private Curso curso;

    public Aluno() {}
    public Aluno(String nome, String email, String matricula, Curso curso) {
        this.nome = nome; this.email = email; this.matricula = matricula; this.curso = curso;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
}
