package com.example.escola.domain;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Universidade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String endereco;

    @OneToMany(mappedBy = "universidade", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Curso> cursos = new ArrayList<>();

    public Universidade() {}
    public Universidade(String nome, String endereco) { this.nome = nome; this.endereco = endereco; }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public List<Curso> getCursos() { return cursos; }
}
