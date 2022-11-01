package br.com.lopesconcept.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cadastro {
    @Id
    private Long id;
    @NotBlank
    private String nomeCompleto;
    private String telefone;
    @NotBlank
    private String email;
    private String localizacao;

}
