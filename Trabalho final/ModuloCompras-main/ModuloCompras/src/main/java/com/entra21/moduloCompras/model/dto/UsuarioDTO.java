package com.entra21.moduloCompras.model.dto;

import com.entra21.moduloCompras.model.entity.EmpresaEntity;
import lombok.Data;

@Data
public class UsuarioDTO {

    private Long id;

    private String nome;

    private String sobrenome;

    private String username;

    private String password;

    private EmpresaEntity empresaEntity;
}