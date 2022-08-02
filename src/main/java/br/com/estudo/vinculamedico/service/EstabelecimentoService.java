package br.com.estudo.vinculamedico.service;

import br.com.estudo.vinculamedico.model.Estabelecimento;
import br.com.estudo.vinculamedico.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstabelecimentoService {

    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    public Iterable<Estabelecimento> getAll() {
        return estabelecimentoRepository.findAll();
    }

    public Estabelecimento getById(Long id) {
        return estabelecimentoRepository.findById(id).get();
    }

    public void save(Estabelecimento estabelecimento) {
        estabelecimentoRepository.save(estabelecimento);
    }

    public void delete(Long id) {
        estabelecimentoRepository.deleteById(id);
    }

    public void update(Long id, Estabelecimento estabelecimento) {
        estabelecimentoRepository.save(estabelecimento);
    }

    public Iterable<Estabelecimento> findAllById(Long id) {
        return estabelecimentoRepository.findAllById(id);
    }

}
