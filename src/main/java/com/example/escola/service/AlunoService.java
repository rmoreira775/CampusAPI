package com.example.escola.service;

import com.example.escola.domain.Aluno;
import com.example.escola.domain.Curso;
import com.example.escola.repository.AlunoRepository;
import com.example.escola.repository.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repo;
    private final CursoRepository cursoRepo;
    public AlunoService(AlunoRepository repo, CursoRepository cursoRepo){
        this.repo = repo; this.cursoRepo = cursoRepo;
    }

    public List<Aluno> listByCurso(Long cursoId){
        return repo.findByCursoIdOrderByNomeAsc(cursoId);
    }
    public Aluno create(Long cursoId, Aluno a){
        Curso c = cursoRepo.findById(cursoId).orElseThrow();
        a.setCurso(c);
        return repo.save(a);
    }
    public Aluno update(Long id, Aluno a){
        Aluno db = repo.findById(id).orElseThrow();
        db.setNome(a.getNome());
        db.setEmail(a.getEmail());
        db.setMatricula(a.getMatricula());
        return repo.save(db);
    }
    public void delete(Long id){ repo.deleteById(id); }
}
