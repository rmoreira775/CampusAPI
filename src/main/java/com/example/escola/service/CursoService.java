package com.example.escola.service;

import com.example.escola.domain.Curso;
import com.example.escola.domain.Universidade;
import com.example.escola.repository.CursoRepository;
import com.example.escola.repository.UniversidadeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {
    private final CursoRepository repo;
    private final UniversidadeRepository universidadeRepo;
    public CursoService(CursoRepository repo, UniversidadeRepository universidadeRepo){
        this.repo = repo; this.universidadeRepo = universidadeRepo;
    }

    public List<Curso> listByUniversidade(Long universidadeId){
        return repo.findByUniversidadeIdOrderByNomeAsc(universidadeId);
    }
    public Curso create(Long universidadeId, Curso c){
        Universidade u = universidadeRepo.findById(universidadeId).orElseThrow();
        c.setUniversidade(u);
        return repo.save(c);
    }
    public Curso update(Long id, Curso c){
        Curso db = repo.findById(id).orElseThrow();
        db.setNome(c.getNome());
        db.setDuracaoSemestres(c.getDuracaoSemestres());
        return repo.save(db);
    }
    public void delete(Long id){ repo.deleteById(id); }
}
