package com.example.escola.controller;

import com.example.escola.domain.Aluno;
import com.example.escola.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cursos/{cursoId}/alunos")
@CrossOrigin
public class AlunoController {
    private final AlunoService service;
    public AlunoController(AlunoService service){ this.service = service; }

    @GetMapping public List<Aluno> list(@PathVariable Long cursoId){ return service.listByCurso(cursoId); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Aluno create(@PathVariable Long cursoId, @RequestBody Aluno a){ return service.create(cursoId, a); }
    @PutMapping("/{id}") public Aluno update(@PathVariable Long cursoId, @PathVariable Long id, @RequestBody Aluno a){ return service.update(id, a); }
    @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long cursoId, @PathVariable Long id){ service.delete(id); }
}
