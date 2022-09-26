package com.entra21.primeiroprojetospring.model.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "dvd")
@PrimaryKeyJoinColumn(name = "id_item", referencedColumnName = "id")
public class DvdEntity extends ItemEntity{


    @Column(name = "diretor")
    private String diretor;

    @Column(name = "duracao")
    private LocalTime duracao;

    @Column(name = "ano_lancamento")
    private int anoLancamento;

    @Column(name = "id_item")
    private long idItem;

    @Override
    public String getType() {
        return "DVD";
    }

}
