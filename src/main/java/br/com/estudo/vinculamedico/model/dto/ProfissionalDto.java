package br.com.estudo.vinculamedico.model.dto;

import br.com.estudo.vinculamedico.model.Profissional;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfissionalDto implements Serializable {
    private Long id;
    private String nome;
    private String funcao;

    public ProfissionalDto(Profissional profissional) {
        this.id = profissional.getId();
        this.nome = profissional.getNome();
        this.funcao = profissional.getFuncao();
    }

}
