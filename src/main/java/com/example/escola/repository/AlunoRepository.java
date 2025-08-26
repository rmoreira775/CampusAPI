package com.example.escola.repository;

import com.example.escola.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByCursoIdOrderByNomeAsc(Long cursoId);
    Optional<Aluno> findByMatricula(String matricula);
}
