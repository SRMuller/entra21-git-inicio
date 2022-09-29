package com.entra21.moduloCompras.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "fornecedores_empresa")

public class FornecedoresEmpresaEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ativo")
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    private EmpresaEntity idEmpresa;

    @ManyToMany
    @JoinColumn(name = "id_fornecedor", referencedColumnName = "id")
    private List<EmpresaEntity> idFornecedor;
}
