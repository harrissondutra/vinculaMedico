package br.com.estudo.vinculamedico.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiIgnore
@Table(name = "profissional")
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "nome")
    private String nome;

    private String endereco;

    private String celular;

    private String telefone;

    private String funcao;


}