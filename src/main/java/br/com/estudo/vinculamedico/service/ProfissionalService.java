package br.com.estudo.vinculamedico.service;

import br.com.estudo.vinculamedico.model.Profissional;
import br.com.estudo.vinculamedico.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfissionalService {

    @Autowired
    ProfissionalRepository profissionalRepository;

    public Iterable<Profissional> getAll() {
        return profissionalRepository.findAll();
    }

    public Profissional getById(Long id) {
        return profissionalRepository.findById(id).get();
    }

    public void save(Profissional profissional) {
        profissionalRepository.save(profissional);
    }

    public void delete(Long id) {
        profissionalRepository.deleteById(id);
    }

    public void update(Long id, Profissional profissional) {
        profissionalRepository.save(profissional);
    }
}
