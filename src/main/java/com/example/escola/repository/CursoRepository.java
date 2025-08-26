package com.example.escola.repository;

import com.example.escola.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByUniversidadeIdOrderByNomeAsc(Long universidadeId);
}
