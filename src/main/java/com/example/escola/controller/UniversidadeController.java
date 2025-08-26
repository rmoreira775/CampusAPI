package com.example.escola.controller;

import com.example.escola.domain.Universidade;
import com.example.escola.service.UniversidadeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/universidades")
@CrossOrigin
public class UniversidadeController {
    private final UniversidadeService service;
    public UniversidadeController(UniversidadeService service){ this.service = service; }

    @GetMapping public List<Universidade> list(){ return service.list(); }
    @GetMapping("/{id}") public Universidade get(@PathVariable Long id){ return service.get(id); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Universidade create(@RequestBody Universidade u){ return service.create(u); }
    @PutMapping("/{id}") public Universidade update(@PathVariable Long id, @RequestBody Universidade u){ return service.update(id,u); }
    @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){ service.delete(id); }
}
