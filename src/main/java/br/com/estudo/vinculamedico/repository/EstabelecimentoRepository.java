package br.com.estudo.vinculamedico.repository;

import br.com.estudo.vinculamedico.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}