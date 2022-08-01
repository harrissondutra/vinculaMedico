package br.com.estudo.vinculamedico.repository;

import br.com.estudo.vinculamedico.model.ProfissionalEstabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfissionalEstabelecimentoRepository extends JpaRepository<ProfissionalEstabelecimento, Long> {
    List<ProfissionalEstabelecimento> findAllByProfissional_Id(Long id);

    List<ProfissionalEstabelecimento> findAllByEstabelecimento_Id(Long id);

    List<ProfissionalEstabelecimento> findAllByProfissional_IdAndEstabelecimento_Id(Long id, Long idEstabelecimento);
}