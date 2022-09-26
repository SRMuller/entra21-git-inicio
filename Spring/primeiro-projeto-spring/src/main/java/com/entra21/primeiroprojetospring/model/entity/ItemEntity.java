package com.entra21.primeiroprojetospring.model.entity;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "item")

public abstract class ItemEntity  {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idItem;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "valor_venda")
    private double valorDeVenda;

    @Column(name = "valor_locacao")
    private double valorLocacao;

    @Column(name = "emprestado")
    private boolean emprestado;

    @ManyToOne
    @JoinColumn(name = "id_franquia", referencedColumnName = "id")
    private FranquiaEntity franquia;

    @OneToMany(mappedBy = "item")
    private Set<AvaliacaoEntity> avaliacoes;

    @ManyToMany
    @JoinTable(name = "genero_item", joinColumns = @JoinColumn(name = "id-item"),
    inverseJoinColumns = @JoinColumn(name = "id_genero"))
    private Set<GeneroEntity> generos;

    public abstract String getType();
}
