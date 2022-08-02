package br.com.estudo.vinculamedico.service;

import br.com.estudo.vinculamedico.model.ProfissionalEstabelecimento;
import br.com.estudo.vinculamedico.repository.ProfissionalEstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfissionalEstabelecimentoService {

    @Autowired
    ProfissionalEstabelecimentoRepository profissionalEstabelecimentoRepository;

    public void save(ProfissionalEstabelecimento profissionalEstabelecimento) {
        profissionalEstabelecimentoRepository.save(profissionalEstabelecimento);
    }

    public void delete(Long id, ProfissionalEstabelecimento profissionalEstabelecimento) {
        profissionalEstabelecimentoRepository.delete(profissionalEstabelecimento);
    }

    public ProfissionalEstabelecimento update(ProfissionalEstabelecimento profissionalEstabelecimento) {
        return profissionalEstabelecimentoRepository.save(profissionalEstabelecimento);
    }

    public ProfissionalEstabelecimento findById(Long id) {
        return profissionalEstabelecimentoRepository.findById(id).get();
    }

    public Iterable<ProfissionalEstabelecimento> findAll() {
        return profissionalEstabelecimentoRepository.findAll();
    }

    public Iterable<ProfissionalEstabelecimento> findAllByProfissional_Id(Long id) {
        return profissionalEstabelecimentoRepository.findAllByProfissional_Id(id);
    }

    public Iterable<ProfissionalEstabelecimento> findAllByEstabelecimento_Id(Long id) {
        return profissionalEstabelecimentoRepository.findAllByEstabelecimento_Id(id);
    }

}
