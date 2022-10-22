package com.entra21.moduloCompras.model.dto;

import com.entra21.moduloCompras.model.entity.PessoaEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PessoaDTO {
    private Long id;

    private String nome;

    private String sobrenome;

    private String telefone;

    private String cpf;

    private Boolean ativo;

    private String login;

    private String senha;

    public PessoaDTO(PessoaEntity e) {
        this.id = e.getId();
        this.nome = e.getNome();
        this.sobrenome = e.getSobrenome();
        this.telefone = e.getTelefone();
        this.cpf = e.getCpf();
        this.ativo = e.getAtivo();
        this.login = e.getLogin();
        this.senha = e.getSenha();
    }
}
