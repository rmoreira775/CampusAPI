package com.example.escola.service;

import com.example.escola.domain.Universidade;
import com.example.escola.repository.UniversidadeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UniversidadeService {
    private final UniversidadeRepository repo;
    public UniversidadeService(UniversidadeRepository repo){ this.repo = repo; }

    public List<Universidade> list(){ return repo.findAll(); }
    public Universidade get(Long id){ return repo.findById(id).orElseThrow(); }
    public Universidade create(Universidade u){ return repo.save(u); }
    public Universidade update(Long id, Universidade u){
        Universidade db = get(id);
        db.setNome(u.getNome());
        db.setEndereco(u.getEndereco());
        return repo.save(db);
    }
    public void delete(Long id){ repo.deleteById(id); }
}
