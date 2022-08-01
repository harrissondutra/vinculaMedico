package br.com.estudo.vinculamedico.controller;

import br.com.estudo.vinculamedico.model.Profissional;
import br.com.estudo.vinculamedico.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController {

    @Autowired
    ProfissionalService profissionalService;

    protected ProfissionalService getService() {
        return profissionalService;
    }

    @GetMapping
    public Iterable<Profissional> getAll() {
        return getService().getAll();
    }

    @GetMapping("/{id}")
    public Profissional getById(Long id) {
        return getService().getById(id);
    }

    @PostMapping
    public void save(@Valid @RequestBody Profissional profissional) {
        getService().save(profissional);
    }

    @PostMapping("/{id}")
    public void update(Long id, Profissional profissional) {
        getService().update(id, profissional);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        getService().delete(id);
    }
}
