package com.example.escola.controller;

import com.example.escola.domain.Curso;
import com.example.escola.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/universidades/{universidadeId}/cursos")
@CrossOrigin
public class CursoController {
    private final CursoService service;
    public CursoController(CursoService service){ this.service = service; }

    @GetMapping public List<Curso> list(@PathVariable Long universidadeId){ return service.listByUniversidade(universidadeId); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Curso create(@PathVariable Long universidadeId, @RequestBody Curso c){ return service.create(universidadeId, c); }
    @PutMapping("/{id}") public Curso update(@PathVariable Long universidadeId, @PathVariable Long id, @RequestBody Curso c){ return service.update(id, c); }
    @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long universidadeId, @PathVariable Long id){ service.delete(id); }
}
