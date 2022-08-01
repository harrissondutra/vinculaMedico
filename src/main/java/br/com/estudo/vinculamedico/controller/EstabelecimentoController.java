package br.com.estudo.vinculamedico.controller;

import br.com.estudo.vinculamedico.model.Estabelecimento;
import br.com.estudo.vinculamedico.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    EstabelecimentoService estabelecimentoService;

    protected EstabelecimentoService getService() {
        return estabelecimentoService;
    }

    @GetMapping
    public Iterable<Estabelecimento> getAll() {
        return getService().getAll();
    }

    @GetMapping("/{id}")
    public Estabelecimento getById(@PathVariable Long id) {
        return getService().getById(id);
    }

    @PostMapping
    public void save(@RequestBody Estabelecimento estabelecimento) {
        getService().save(estabelecimento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        getService().delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Estabelecimento estabelecimento) {
        getService().update(id, estabelecimento);
    }




}
