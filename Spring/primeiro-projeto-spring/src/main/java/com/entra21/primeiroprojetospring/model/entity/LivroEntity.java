package com.entra21.primeiroprojetospring.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "livro")
@PrimaryKeyJoinColumn(name = "id_item", referencedColumnName = "id")
public class LivroEntity extends  ItemEntity{


    @Column(name = "autor")
    private String autor;

    @Column(name = "qtde_paginas")
    private int quantidade;

    @Column(name = "ano_plubicacao")
    private int anoPubicacao;

    @Column(name = "edicao")
    private int edicao;

    @Override
    public String getType() {
        return "Livro";
    }

}
