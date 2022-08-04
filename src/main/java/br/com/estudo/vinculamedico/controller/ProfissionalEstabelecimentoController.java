package br.com.estudo.vinculamedico.controller;

import br.com.estudo.vinculamedico.model.ProfissionalEstabelecimento;
import br.com.estudo.vinculamedico.service.ProfissionalEstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profissionalEstabelecimento")
public class ProfissionalEstabelecimentoController {

    @Autowired
    ProfissionalEstabelecimentoService profissionalEstabelecimentoService;

    @GetMapping
    public Iterable<ProfissionalEstabelecimento> getAll() {
        return profissionalEstabelecimentoService.findAll();
    }

    @GetMapping("{id}")
    public ProfissionalEstabelecimento getById(@PathVariable Long id) {
        return profissionalEstabelecimentoService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody ProfissionalEstabelecimento profissionalEstabelecimento) {
        profissionalEstabelecimentoService.save(profissionalEstabelecimento);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id, @RequestBody ProfissionalEstabelecimento profissionalEstabelecimento) {
        profissionalEstabelecimentoService.delete(id, profissionalEstabelecimento);
    }

    @GetMapping("/profissional/{id}")
    public Iterable<ProfissionalEstabelecimento> findAllEstabelecimentoByProfissionalId(@PathVariable Long id) {
        return profissionalEstabelecimentoService.findAllByProfissional_Id(id);
    }

    @GetMapping("/estabelecimento/{id}")
    public Iterable<ProfissionalEstabelecimento> findAllByEstabelecimento_Id(@PathVariable Long id) {
        return profissionalEstabelecimentoService.findAllByEstabelecimento_Id(id);
    }


}
