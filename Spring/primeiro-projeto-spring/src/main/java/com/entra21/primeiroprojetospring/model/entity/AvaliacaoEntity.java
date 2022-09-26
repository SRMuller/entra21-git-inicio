package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "avaliacao")
public class AvaliacaoEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_avaliador")
    private String nomeAvaliador;

    @Column(name = "nota")
    private Double notas;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "idItem", referencedColumnName = "id")
    private ItemEntity item;


}
