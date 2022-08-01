package br.com.estudo.vinculamedico.repository;

import br.com.estudo.vinculamedico.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
}